package com.github.codeman.cilidili;


import com.github.codeman.cilidili.domain.auth.AuthRole;
import com.github.codeman.cilidili.domain.auth.AuthRoleElementOperation;
import com.github.codeman.cilidili.domain.auth.AuthRoleMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Set;

/**
* @author kangxi
* @description 针对表【t_auth_role(权限控制--角色表)】的数据库操作Service
* @createDate 2024-01-24 17:07:36
*/
public interface AuthRoleService extends IService<AuthRole> {

    List<AuthRoleElementOperation> getRoleElementOperationsByRoleIds(Set<Long> roleIdSet);

    List<AuthRoleMenu> getRoleMenusByRoleIds(Set<Long> roleIdSet);

    AuthRole getRoleByCode(String code);
}
