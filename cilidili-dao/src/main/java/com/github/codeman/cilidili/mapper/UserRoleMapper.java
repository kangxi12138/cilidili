package com.github.codeman.cilidili.mapper;


import com.github.codeman.cilidili.domain.auth.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author kangxi
* @description 针对表【t_user_role(用户角色关联表)】的数据库操作Mapper
* @createDate 2024-01-24 17:07:16
* @Entity com.github.codeman.cilidili.domain.auth.UserRole
*/
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<UserRole> getUserRoleByUserId(Long userId);
}




