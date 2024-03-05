package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.UserMoments;
import com.github.codeman.cilidili.domain.constant.UserMomentsConstant;
import com.github.codeman.cilidili.mapper.UserMomentsMapper;
import com.github.codeman.cilidili.UserMomentsService;
import com.github.codeman.cilidili.util.RocketMQUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author kangxi
* @description 针对表【t_user_moments(用户动态表)】的数据库操作Service实现
* @createDate 2024-01-24 12:32:12
*/
@Service
public class UserMomentsServiceImpl extends ServiceImpl<UserMomentsMapper, UserMoments>
    implements UserMomentsService {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public void addUserMoments(UserMoments userMoments) throws Exception {
        this.save(userMoments);
        userMoments = this.getById(userMoments.getId());
        DefaultMQProducer defaultMQProducer = (DefaultMQProducer) applicationContext.getBean("momentsProducer");
        Message message = new Message(UserMomentsConstant.TOPIC_MOMENTS, JSONObject.toJSONString(userMoments).getBytes());
        RocketMQUtil.syncSendMsg(defaultMQProducer,message);
    }

    @Override
    public List<UserMoments> getUserSubscribedMoments(Long userId) {
        String key = "subscribed-" + userId;
        String listStr = redisTemplate.opsForValue().get(key);
        System.out.println(listStr);
        return JSONArray.parseArray(listStr, UserMoments.class);
    }
}




