package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.auth.AuthRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_auth_role(权限控制--角色表)】的数据库操作Mapper
* @createDate 2024-01-24 17:07:36
* @Entity com.github.codeman.cilidili.domain.auth.AuthRole
*/
@Mapper
public interface AuthRoleMapper extends BaseMapper<AuthRole> {

}




