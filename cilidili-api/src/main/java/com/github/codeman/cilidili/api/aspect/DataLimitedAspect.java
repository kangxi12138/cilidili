package com.github.codeman.cilidili.api.aspect;

import com.github.codeman.cilidili.api.support.UserSupport;
import com.github.codeman.cilidili.domain.UserMoments;
import com.github.codeman.cilidili.domain.auth.UserRole;
import com.github.codeman.cilidili.domain.constant.AuthRoleConstant;
import com.github.codeman.cilidili.domain.exception.ConditionException;
import com.github.codeman.cilidili.UserRoleService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 数据限流切切面
 */
@Order(1)
@Component
@Aspect
public class DataLimitedAspect {

    @Autowired
    private UserSupport userSupport;

    @Autowired
    private UserRoleService userRoleService;

    //定义切点
    @Pointcut("@annotation(com.github.codeman.cilidili.domain.annotation.DataLimited)")
    public void check(){
    }

    @Before("check()")
    public void doBefore(JoinPoint joinPoint){
        Long userId = userSupport.getCurrentUserId();
        List<UserRole> userRoleList = userRoleService.getUserRoleByUserId(userId);
        Set<String> roleCodeSet = userRoleList.stream().map(UserRole::getRoleCode).collect(Collectors.toSet());
        Object[] args = joinPoint.getArgs();
        for(Object arg:args){
            if(arg instanceof UserMoments){
                UserMoments userMoments = (UserMoments) arg;
                String type = userMoments.getType();
                if(roleCodeSet.contains(AuthRoleConstant.ROLE_LV0) && !"0".equals(type)){
                    throw new ConditionException("参数异常！");
                }
            }
        }
    }
}
