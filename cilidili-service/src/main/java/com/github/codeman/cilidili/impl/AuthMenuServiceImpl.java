package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.auth.AuthMenu;
import com.github.codeman.cilidili.mapper.AuthMenuMapper;
import com.github.codeman.cilidili.AuthMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author kangxi
* @description 针对表【t_auth_menu(权限控制--页面访问表)】的数据库操作Service实现
* @createDate 2024-01-24 17:07:41
*/
@Service
public class AuthMenuServiceImpl extends ServiceImpl<AuthMenuMapper, AuthMenu>
    implements AuthMenuService {

}




