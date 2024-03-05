package com.github.codeman.cilidili.api;

import com.github.codeman.cilidili.api.support.UserSupport;
import com.github.codeman.cilidili.domain.Danmu;
import com.github.codeman.cilidili.domain.JsonResponse;
import com.github.codeman.cilidili.DanmuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DanmuApi {

    @Autowired
    private UserSupport userSupport;

    @Autowired
    private DanmuService danmuService;

    //查询弹幕
    @GetMapping("/danmus")
    public JsonResponse<List<Danmu>> getDanmus(@RequestParam Long videoId,
                                               String startTime,
                                               String endTime) throws ParseException {
        List<Danmu> list;
        try{
            userSupport.getCurrentUserId();
            //登录模式可以使用按时间筛选
            Map<String,Object> map = new HashMap<>();
            map.put("startDate",startTime);
            map.put("endDate",endTime);
            map.put("videoId",videoId);
            list = danmuService.getDanmus(map);
        }catch (Exception e){
            Map<String,Object> map = new HashMap<>();
            map.put("videoId",videoId);
            list = danmuService.getDanmus(map);
        }
        return new JsonResponse<>(list);
    }

}
