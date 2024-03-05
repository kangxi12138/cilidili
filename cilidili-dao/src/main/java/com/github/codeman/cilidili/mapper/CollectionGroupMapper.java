package com.github.codeman.cilidili.mapper;


import com.github.codeman.cilidili.domain.CollectionGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_collection_group(用户收藏分组表)】的数据库操作Mapper
* @createDate 2024-01-26 16:47:21
* @Entity com.github.codeman.cilidili.domain.CollectionGroup
*/
@Mapper
public interface CollectionGroupMapper extends BaseMapper<CollectionGroup> {

}




