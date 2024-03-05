package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.UserCoin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_user_coin(用户硬币数量表)】的数据库操作Mapper
* @createDate 2024-01-26 17:57:56
* @Entity com.github.codeman.cilidili.domain.UserCoin
*/
@Mapper
public interface UserCoinMapper extends BaseMapper<UserCoin> {

}




