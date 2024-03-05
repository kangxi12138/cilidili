package com.github.codeman.cilidili;

import com.github.codeman.cilidili.domain.UserPreference;
import com.github.codeman.cilidili.domain.VideoOperation;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author kangxi
* @description 针对表【t_video_operation(用户操作表)】的数据库操作Service
* @createDate 2024-01-28 19:22:11
*/
public interface VideoOperationService extends IService<VideoOperation> {

    List<UserPreference> getAllUserPreference();

}
