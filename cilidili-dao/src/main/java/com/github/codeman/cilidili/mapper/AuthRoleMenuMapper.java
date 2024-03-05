package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.auth.AuthRoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
* @author kangxi
* @description 针对表【t_auth_role_menu(权限控制--角色页面菜单关联表)】的数据库操作Mapper
* @createDate 2024-01-24 17:07:25
* @Entity com.github.codeman.cilidili.domain.auth.AuthRoleMenu
*/
@Mapper
public interface AuthRoleMenuMapper extends BaseMapper<AuthRoleMenu> {

    List<AuthRoleMenu> getRoleMenusByRoleIds(@Param("roleIdSet") Set<Long> roleIdSet);
}




