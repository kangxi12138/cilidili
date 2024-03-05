package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.auth.AuthRoleMenu;
import com.github.codeman.cilidili.mapper.AuthRoleMenuMapper;
import com.github.codeman.cilidili.AuthRoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
* @author kangxi
* @description 针对表【t_auth_role_menu(权限控制--角色页面菜单关联表)】的数据库操作Service实现
* @createDate 2024-01-24 17:07:25
*/
@Service
public class AuthRoleMenuServiceImpl extends ServiceImpl<AuthRoleMenuMapper, AuthRoleMenu>
    implements AuthRoleMenuService {

    @Autowired
    private AuthRoleMenuMapper authRoleMenuMapper;
    @Override
    public List<AuthRoleMenu> getRoleMenusByRoleIds(Set<Long> roleIdSet) {
        return authRoleMenuMapper.getRoleMenusByRoleIds(roleIdSet);
    }
}




