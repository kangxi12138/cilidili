package com.github.codeman.cilidili;


import com.github.codeman.cilidili.domain.auth.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author kangxi
* @description 针对表【t_user_role(用户角色关联表)】的数据库操作Service
* @createDate 2024-01-24 17:07:16
*/
public interface UserRoleService extends IService<UserRole> {

    List<UserRole> getUserRoleByUserId(Long userId);
}
