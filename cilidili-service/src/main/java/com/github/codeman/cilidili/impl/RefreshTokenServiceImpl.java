package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.RefreshToken;
import com.github.codeman.cilidili.mapper.RefreshTokenMapper;
import com.github.codeman.cilidili.RefreshTokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author kangxi
* @description 针对表【t_refresh_token(刷新令牌记录表)】的数据库操作Service实现
* @createDate 2024-01-24 23:13:22
*/
@Service
public class RefreshTokenServiceImpl extends ServiceImpl<RefreshTokenMapper, RefreshToken>
    implements RefreshTokenService {

}




