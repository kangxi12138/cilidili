package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.UserPreference;
import com.github.codeman.cilidili.domain.VideoOperation;
import com.github.codeman.cilidili.mapper.VideoOperationMapper;
import com.github.codeman.cilidili.VideoOperationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author kangxi
* @description 针对表【t_video_operation(用户操作表)】的数据库操作Service实现
* @createDate 2024-01-28 19:22:11
*/
@Service
public class VideoOperationServiceImpl extends ServiceImpl<VideoOperationMapper, VideoOperation>
    implements VideoOperationService {

    @Autowired
    private VideoOperationMapper videoOperationMapper;

    @Override
    public List<UserPreference> getAllUserPreference() {
        return  videoOperationMapper.getAllUserPreference();
    }
}




