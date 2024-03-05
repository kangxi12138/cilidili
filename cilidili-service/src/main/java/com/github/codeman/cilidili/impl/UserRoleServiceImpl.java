package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.auth.UserRole;
import com.github.codeman.cilidili.mapper.UserRoleMapper;
import com.github.codeman.cilidili.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author kangxi
* @description 针对表【t_user_role(用户角色关联表)】的数据库操作Service实现
* @createDate 2024-01-24 17:07:16
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> getUserRoleByUserId(Long userId) {
        return userRoleMapper.getUserRoleByUserId(userId);
    }
}




