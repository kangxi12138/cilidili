package com.github.codeman.cilidili.api;

import com.github.codeman.cilidili.api.support.UserSupport;
import com.github.codeman.cilidili.domain.JsonResponse;
import com.github.codeman.cilidili.domain.auth.UserAuthorities;
import com.github.codeman.cilidili.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthApi {

    @Autowired
    private UserSupport userSupport;

    @Autowired
    private UserAuthService userAuthService;

    //获取用户权限信息
    @GetMapping("/user-authorities")
    public JsonResponse<UserAuthorities> getUserAuthorities(){
        Long userId = userSupport.getCurrentUserId();
        UserAuthorities userAuthorities = userAuthService.getUserAuthorities(userId);
        return new JsonResponse<>(userAuthorities);
    }
}
