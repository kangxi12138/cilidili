package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.UserCoin;
import com.github.codeman.cilidili.mapper.UserCoinMapper;
import com.github.codeman.cilidili.UserCoinService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author kangxi
* @description 针对表【t_user_coin(用户硬币数量表)】的数据库操作Service实现
* @createDate 2024-01-26 17:57:56
*/
@Service
public class UserCoinServiceImpl extends ServiceImpl<UserCoinMapper, UserCoin>
    implements UserCoinService {

    @Override
    public Long getUserCoinAmount(Long userId) {
        QueryWrapper<UserCoin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",userId);
        UserCoin userCoin = this.getOne(queryWrapper);
        return userCoin.getAmount();
    }

    @Override
    public void updateUserCoinAmount(Long userId, long amount) {
        UserCoin userCoin = new UserCoin();
        userCoin.setAmount(amount);
        UpdateWrapper<UserCoin> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("user_id",userId);
        this.update(userCoin,updateWrapper);
    }
}




