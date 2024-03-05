package com.github.codeman.cilidili.mapper;


import com.github.codeman.cilidili.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_user(用户表)】的数据库操作Mapper
* @createDate 2024-01-22 21:44:21
* @Entity com.github.codeman.cilidili.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




