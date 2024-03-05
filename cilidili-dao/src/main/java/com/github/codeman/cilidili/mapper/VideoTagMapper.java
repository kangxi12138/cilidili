package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.VideoTag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_video_tag(视频标签关联表)】的数据库操作Mapper
* @createDate 2024-01-25 22:16:10
* @Entity com.github.codeman.cilidili.domain.VideoTag
*/
@Mapper
public interface VideoTagMapper extends BaseMapper<VideoTag> {

}




