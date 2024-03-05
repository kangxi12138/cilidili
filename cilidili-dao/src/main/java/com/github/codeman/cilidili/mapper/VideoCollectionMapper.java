package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.VideoCollection;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_video_collection(视频收藏表)】的数据库操作Mapper
* @createDate 2024-01-26 16:47:15
* @Entity com.github.codeman.cilidili.domain.VideoCollection
*/
@Mapper
public interface VideoCollectionMapper extends BaseMapper<VideoCollection> {

}




