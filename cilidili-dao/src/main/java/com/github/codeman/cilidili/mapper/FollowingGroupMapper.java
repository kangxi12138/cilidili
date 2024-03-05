package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.FollowingGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_following_group(用户关注分组表)】的数据库操作Mapper
* @createDate 2024-01-23 14:03:22
* @Entity com.github.codeman.cilidili.domain.FollowingGroup
*/
@Mapper
public interface FollowingGroupMapper extends BaseMapper<FollowingGroup> {

}




