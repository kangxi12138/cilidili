package com.github.codeman.cilidili;

import com.github.codeman.cilidili.domain.auth.AuthRoleElementOperation;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Set;

/**
* @author kangxi
* @description 针对表【t_auth_role_element_operation(权限控制--角色与元素操作关联表)】的数据库操作Service
* @createDate 2024-01-24 17:07:31
*/
public interface AuthRoleElementOperationService extends IService<AuthRoleElementOperation> {

    List<AuthRoleElementOperation> getRoleElementOperationsByRoleIds(Set<Long> roleIdSet);
}
