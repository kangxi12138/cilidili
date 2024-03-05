package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.Video;
import com.github.codeman.cilidili.domain.VideoCollection;
import com.github.codeman.cilidili.domain.exception.ConditionException;
import com.github.codeman.cilidili.mapper.VideoCollectionMapper;
import com.github.codeman.cilidili.VideoCollectionService;
import com.github.codeman.cilidili.VideoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
* @author kangxi
* @description 针对表【t_video_collection(视频收藏表)】的数据库操作Service实现
* @createDate 2024-01-26 16:47:15
*/
@Service
public class VideoCollectionServiceImpl extends ServiceImpl<VideoCollectionMapper, VideoCollection>
    implements VideoCollectionService {

    @Autowired
    private VideoService videoService;


    @Override
    @Transactional
    public void addVideoCollection(VideoCollection videoCollection, Long userId) {
        if(videoCollection ==null){
            throw new ConditionException("参数异常！");
        }
        Long videoId = videoCollection.getVideoId();
        Long groupId = videoCollection.getGroupId();
        if(videoId==null || groupId==null){
            throw new ConditionException("参数异常！");
        }
        Video video = videoService.getById(videoId);
        if(video ==null){
            throw new ConditionException("非法视频！");
        }
        //删除原有视频收藏
        QueryWrapper<VideoCollection> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("video_id",videoId);
        queryWrapper.eq("group_id",groupId);
        this.remove(queryWrapper);
        //添加新的视频收藏
        videoCollection.setUserId(userId);
        this.save(videoCollection);
    }

    @Override
    public void deleteVideoCollections(Long videoId, Long userId) {
        QueryWrapper<VideoCollection> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("video_id",videoId);
        queryWrapper.eq("user_id",userId);
        this.remove(queryWrapper);
    }

    @Override
    public Map<String, Object> getVideoCollections(Long videoId, Long userId) {
        QueryWrapper<VideoCollection> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("video_id",videoId);
        int count = this.count(queryWrapper);
        queryWrapper.eq("user_id",userId);
        VideoCollection videoCollection = this.getOne(queryWrapper);
        boolean like = videoCollection !=null;
        Map<String,Object> map = new HashMap<>();
        map.put("count",count);
        map.put("like",like);
        return map;
    }
}




