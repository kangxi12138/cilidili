package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.auth.AuthRole;
import com.github.codeman.cilidili.domain.auth.AuthRoleElementOperation;
import com.github.codeman.cilidili.domain.auth.AuthRoleMenu;
import com.github.codeman.cilidili.mapper.AuthRoleMapper;
import com.github.codeman.cilidili.AuthRoleElementOperationService;
import com.github.codeman.cilidili.AuthRoleMenuService;
import com.github.codeman.cilidili.AuthRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
* @author kangxi
* @description 针对表【t_auth_role(权限控制--角色表)】的数据库操作Service实现
* @createDate 2024-01-24 17:07:36
*/
@Service
public class AuthRoleServiceImpl extends ServiceImpl<AuthRoleMapper, AuthRole>
    implements AuthRoleService {

    @Autowired
    private AuthRoleElementOperationService authRoleElementOperationService;

    @Autowired
    private AuthRoleMenuService authRoleMenuService;
    @Override
    public List<AuthRoleElementOperation> getRoleElementOperationsByRoleIds(Set<Long> roleIdSet) {
        return  authRoleElementOperationService.getRoleElementOperationsByRoleIds(roleIdSet);
    }

    @Override
    public List<AuthRoleMenu> getRoleMenusByRoleIds(Set<Long> roleIdSet) {
        return  authRoleMenuService.getRoleMenusByRoleIds(roleIdSet);
    }

    @Override
    public AuthRole getRoleByCode(String code) {
        QueryWrapper<AuthRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("code",code);
        AuthRole authRole = this.getOne(queryWrapper);
        return authRole;
    }
}




