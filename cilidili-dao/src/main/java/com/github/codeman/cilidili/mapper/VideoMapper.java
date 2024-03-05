package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.Video;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_video(视频投稿记录表)】的数据库操作Mapper
* @createDate 2024-01-25 22:16:01
* @Entity com.github.codeman.cilidili.domain.Video
*/
@Mapper
public interface VideoMapper extends BaseMapper<Video> {

}




