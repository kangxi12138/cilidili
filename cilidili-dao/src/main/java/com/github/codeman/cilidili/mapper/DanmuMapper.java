package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.Danmu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_danmu(弹幕表)】的数据库操作Mapper
* @createDate 2024-01-27 19:08:49
* @Entity com.github.codeman.cilidili.domain.Danmu
*/
@Mapper
public interface DanmuMapper extends BaseMapper<Danmu> {

}




