package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.UserMoments;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_user_moments(用户动态表)】的数据库操作Mapper
* @createDate 2024-01-24 12:32:12
* @Entity com.github.codeman.cilidili.domain.UserMoments
*/
@Mapper
public interface UserMomentsMapper extends BaseMapper<UserMoments> {

}




