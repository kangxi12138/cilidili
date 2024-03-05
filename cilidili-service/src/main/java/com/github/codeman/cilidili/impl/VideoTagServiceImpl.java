package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.VideoTag;
import com.github.codeman.cilidili.mapper.VideoTagMapper;
import com.github.codeman.cilidili.VideoTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author kangxi
* @description 针对表【t_video_tag(视频标签关联表)】的数据库操作Service实现
* @createDate 2024-01-25 22:16:10
*/
@Service
public class VideoTagServiceImpl extends ServiceImpl<VideoTagMapper, VideoTag>
    implements VideoTagService {

}




