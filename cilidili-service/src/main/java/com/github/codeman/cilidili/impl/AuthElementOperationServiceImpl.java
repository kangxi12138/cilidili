package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.auth.AuthElementOperation;
import com.github.codeman.cilidili.mapper.AuthElementOperationMapper;
import com.github.codeman.cilidili.AuthElementOperationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author kangxi
* @description 针对表【t_auth_element_operation(权限控制--页面元素操作表)】的数据库操作Service实现
* @createDate 2024-01-24 17:07:46
*/
@Service
public class AuthElementOperationServiceImpl extends ServiceImpl<AuthElementOperationMapper, AuthElementOperation>
    implements AuthElementOperationService {

}




