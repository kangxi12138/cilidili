package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.VideoComment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_video_comment(视频评论表)】的数据库操作Mapper
* @createDate 2024-01-27 13:55:15
* @Entity com.github.codeman.cilidili.domain.VideoComment
*/
@Mapper
public interface VideoCommentMapper extends BaseMapper<VideoComment> {

}




