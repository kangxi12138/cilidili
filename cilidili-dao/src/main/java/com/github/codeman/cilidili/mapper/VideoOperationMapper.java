package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.UserPreference;
import com.github.codeman.cilidili.domain.VideoOperation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author kangxi
* @description 针对表【t_video_operation(用户操作表)】的数据库操作Mapper
* @createDate 2024-01-28 19:22:11
* @Entity com.github.codeman.cilidili.domain.VideoOperation
*/
@Mapper
public interface VideoOperationMapper extends BaseMapper<VideoOperation> {

    List<UserPreference> getAllUserPreference();
}




