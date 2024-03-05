package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.VideoView;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
* @author kangxi
* @description 针对表【t_video_view(视频观看记录表)】的数据库操作Mapper
* @createDate 2024-01-28 15:39:13
* @Entity com.github.codeman.cilidili.domain.VideoView
*/
@Mapper
public interface VideoViewMapper extends BaseMapper<VideoView> {

    VideoView getVideoView(Map<String, Object> params);
}




