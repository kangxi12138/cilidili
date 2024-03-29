package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.Video;
import com.github.codeman.cilidili.domain.VideoLike;
import com.github.codeman.cilidili.domain.exception.ConditionException;
import com.github.codeman.cilidili.mapper.VideoLikeMapper;
import com.github.codeman.cilidili.VideoLikeService;
import com.github.codeman.cilidili.VideoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
* @author kangxi
* @description 针对表【t_video_like(视频点赞表)】的数据库操作Service实现
* @createDate 2024-01-26 15:52:53
*/
@Service
public class VideoLikeServiceImpl extends ServiceImpl<VideoLikeMapper, VideoLike>
    implements VideoLikeService {

    @Autowired
    private VideoService videoService;

    @Override
    public void addVideoLike(Long videoId, Long userId) {
        Video video = videoService.getById(videoId);
        if(video==null){
            throw new ConditionException("非法视频！");
        }
        QueryWrapper<VideoLike> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",userId);
        queryWrapper.eq("video_id",videoId);
        VideoLike one = this.getOne(queryWrapper);
        if(one !=null){
            throw new ConditionException("已经点过赞！");
        }
        VideoLike videoLike = new VideoLike();
        videoLike.setUserId(userId);
        videoLike.setVideoId(videoId);
        this.save(videoLike);
    }

    @Override
    public void deleteVideoLike(Long videoId, Long userId) {
        QueryWrapper<VideoLike> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",userId);
        queryWrapper.eq("video_id",videoId);
        this.remove(queryWrapper);
    }

    @Override
    public Map<String, Object> getVideoLike(Long videoId, Long userId) {
        QueryWrapper<VideoLike> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("video_id",videoId);
        int count = this.count(queryWrapper);
        queryWrapper.eq("user_id",userId);
        VideoLike videoLike = this.getOne(queryWrapper);
        //判断用户是否关注过
        boolean like = videoLike !=null;
        Map<String,Object> map = new HashMap<>();
        map.put("count",count);
        map.put("like",like);
        return map;
    }
}




