package com.github.codeman.cilidili.api;

import com.github.codeman.cilidili.api.support.UserSupport;
import com.github.codeman.cilidili.domain.JsonResponse;
import com.github.codeman.cilidili.domain.PageResult;
import com.github.codeman.cilidili.domain.User;
import com.github.codeman.cilidili.domain.UserInfo;
import com.github.codeman.cilidili.UserFollowingService;
import com.github.codeman.cilidili.UserService;
import com.github.codeman.cilidili.util.RSAUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@RestController
public class UserApi {

    @Autowired
    private UserService userService;

    @Autowired
    private UserSupport userSupport;

    @Autowired
    private UserFollowingService userFollowingService;

    @GetMapping("/users")
    public JsonResponse<User> getUserInfo(){
        Long userId = userSupport.getCurrentUserId();
        User user = userService.getUserInfo(userId);
        return new JsonResponse<>(user);
    }

    //    获取rsa公钥
    @GetMapping("/rsa-pks")
    public JsonResponse<String> getRsaPublicKey() {
        String publicKeyStr = RSAUtil.getPublicKeyStr();
        return JsonResponse.success(publicKeyStr);
    }

    //用户注册
    @PostMapping("/users")
    public JsonResponse<String> addUser(@RequestBody User user) {
        userService.addUser(user);
        return JsonResponse.success();
    }

    //登录 生成token
    @PostMapping("/user-tokens")
    public JsonResponse<String> login(@RequestBody User user) throws Exception {
        String token = userService.login(user);
        return JsonResponse.success(token);
    }

    @PutMapping("/users")
    public JsonResponse<String> updateUsers(@RequestBody User user){
        Long userId = userSupport.getCurrentUserId();
        user.setId(userId);
        userService.updateById(user);
        return JsonResponse.success();
    }

    @PutMapping("/user-infos")
    public JsonResponse<String> updateUserInfos(@RequestBody UserInfo userInfo){
        Long userId = userSupport.getCurrentUserId();
        userInfo.setUserId(userId);
        userService.updateUserInfos(userInfo);
        return JsonResponse.success();
    }

    //用户分页查询
    @GetMapping("/user-infos")
    public JsonResponse<PageResult<UserInfo>> pageListUserInfos(@RequestParam Integer page,@RequestParam Integer size,@RequestParam  String nick){
        Long userId = userSupport.getCurrentUserId();
        JSONObject params = new JSONObject();
        params.put("page",page);
        params.put("size",size);
        params.put("nick",nick);
        params.put("userId",userId);
        PageResult<UserInfo> result =  userService.pageListUserInfos(params);
        //判断是否关注该用户
        if(result.getTotal() >0){
            List<UserInfo> checkedUserInfoList = userFollowingService.checkFollowingStatus(result.getList(),userId);
            result.setList(checkedUserInfoList);
        }
        return new JsonResponse<>(result);
    }

    //双token机制，带刷新
    @PostMapping("/user-dts")
    public JsonResponse<Map<String,Object>> loginForDts(@RequestBody User user) throws Exception {
        Map<String,Object> map = userService.loginForDts(user);
        return new JsonResponse<>(map);
    }

    //双令牌退出登录
    @DeleteMapping("/refresh-tokens")
    public JsonResponse<String> logout(HttpServletRequest request){
        String refreshToken = request.getHeader("refreshToken");
        Long userId = userSupport.getCurrentUserId();
        userService.logout(refreshToken,userId);
        return JsonResponse.success();
    }

    @PostMapping("/access-tokens")
    public JsonResponse<String> refreshAccessToken(HttpServletRequest request) throws Exception {
        String refreshToken = request.getHeader("refreshToken");
        String accessToken = userService.refreshAccessToken(refreshToken);
        return new JsonResponse<>(accessToken);
    }

}
