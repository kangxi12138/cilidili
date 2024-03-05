package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.auth.AuthMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_auth_menu(权限控制--页面访问表)】的数据库操作Mapper
* @createDate 2024-01-24 17:07:41
* @Entity com.github.codeman.cilidili.domain.auth.AuthMenu
*/
@Mapper
public interface AuthMenuMapper extends BaseMapper<AuthMenu> {

}




