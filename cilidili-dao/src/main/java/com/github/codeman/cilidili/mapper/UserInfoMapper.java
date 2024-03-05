package com.github.codeman.cilidili.mapper;


import com.github.codeman.cilidili.domain.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_user_info(用户基本信息表)】的数据库操作Mapper
* @createDate 2024-01-22 21:54:15
* @Entity generator.domain.UserInfo
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




