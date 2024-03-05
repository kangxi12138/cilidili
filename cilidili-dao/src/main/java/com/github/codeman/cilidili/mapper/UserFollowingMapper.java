package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.UserFollowing;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_user_following(用户关注表)】的数据库操作Mapper
* @createDate 2024-01-23 13:57:05
* @Entity com.github.codeman.cilidili.domain.UserFollowing
*/
@Mapper
public interface UserFollowingMapper extends BaseMapper<UserFollowing> {

}




