package com.github.codeman.cilidili.mapper;


import com.github.codeman.cilidili.domain.auth.AuthElementOperation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_auth_element_operation(权限控制--页面元素操作表)】的数据库操作Mapper
* @createDate 2024-01-24 17:07:46
* @Entity com.github.codeman.cilidili.domain.auth.AuthElementOperation
*/
@Mapper
public interface AuthElementOperationMapper extends BaseMapper<AuthElementOperation> {

}




