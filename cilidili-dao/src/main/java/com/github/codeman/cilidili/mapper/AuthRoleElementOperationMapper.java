package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.auth.AuthRoleElementOperation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
* @author kangxi
* @description 针对表【t_auth_role_element_operation(权限控制--角色与元素操作关联表)】的数据库操作Mapper
* @createDate 2024-01-24 17:07:31
* @Entity com.github.codeman.cilidili.domain.auth.AuthRoleElementOperation
*/
@Mapper
public interface AuthRoleElementOperationMapper extends BaseMapper<AuthRoleElementOperation> {

    List<AuthRoleElementOperation> getRoleElementOperationsByRoleIds(@Param("roleIdSet") Set<Long> roleIdSet);
}




