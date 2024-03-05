package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.auth.*;
import com.github.codeman.cilidili.domain.constant.AuthRoleConstant;
import com.github.codeman.cilidili.AuthRoleService;
import com.github.codeman.cilidili.UserAuthService;
import com.github.codeman.cilidili.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private AuthRoleService authRoleService;


    @Override
    public UserAuthorities getUserAuthorities(Long userId) {
        List<UserRole> userRoleList = userRoleService.getUserRoleByUserId(userId);
        Set<Long> roleIdSet = userRoleList.stream().map(UserRole::getRoleId).collect(Collectors.toSet());
        List<AuthRoleElementOperation> roleElementOperationList = authRoleService.getRoleElementOperationsByRoleIds(roleIdSet);
        List<AuthRoleMenu> authRoleMenuList = authRoleService.getRoleMenusByRoleIds(roleIdSet);
        UserAuthorities userAuthorities = new UserAuthorities();
        userAuthorities.setRoleElementOperationList(roleElementOperationList);
        userAuthorities.setRoleMenuList(authRoleMenuList);
        return userAuthorities;
    }

    @Override
    public void addUserDefaultRole(Long id) {
        UserRole userRole = new UserRole();
        AuthRole role = authRoleService.getRoleByCode(AuthRoleConstant.ROLE_LV0);
        userRole.setUserId(id);
        userRole.setRoleId(role.getId());
        userRoleService.save(userRole);
    }
}
