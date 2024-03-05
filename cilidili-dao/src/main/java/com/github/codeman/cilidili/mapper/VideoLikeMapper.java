package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.VideoLike;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_video_like(视频点赞表)】的数据库操作Mapper
* @createDate 2024-01-26 15:52:53
* @Entity com.github.codeman.cilidili.domain.VideoLike
*/
@Mapper
public interface VideoLikeMapper extends BaseMapper<VideoLike> {

}




