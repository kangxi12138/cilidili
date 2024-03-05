package com.github.codeman.cilidili.mapper;


import com.github.codeman.cilidili.domain.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_tag(标签表)】的数据库操作Mapper
* @createDate 2024-01-25 22:15:54
* @Entity com.github.codeman.cilidili.domain.Tag
*/
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

}




