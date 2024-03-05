package com.github.codeman.cilidili;


import com.github.codeman.cilidili.domain.UserMoments;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author kangxi
* @description 针对表【t_user_moments(用户动态表)】的数据库操作Service
* @createDate 2024-01-24 12:32:12
*/
public interface UserMomentsService extends IService<UserMoments> {

    void addUserMoments(UserMoments userMoments) throws Exception;

    List<UserMoments> getUserSubscribedMoments(Long userId);
}
