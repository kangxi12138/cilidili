package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.RefreshToken;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_refresh_token(刷新令牌记录表)】的数据库操作Mapper
* @createDate 2024-01-24 23:13:22
* @Entity com.github.codeman.cilidili.domain.RefreshToken
*/
@Mapper
public interface RefreshTokenMapper extends BaseMapper<RefreshToken> {

}




