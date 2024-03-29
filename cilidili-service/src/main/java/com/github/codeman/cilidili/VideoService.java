package com.github.codeman.cilidili;


import com.github.codeman.cilidili.domain.PageResult;
import com.github.codeman.cilidili.domain.Video;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.mahout.cf.taste.common.TasteException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
* @author kangxi
* @description 针对表【t_video(视频投稿记录表)】的数据库操作Service
* @createDate 2024-01-25 22:16:01
*/
public interface VideoService extends IService<Video> {

    void addVideos(Video video);

    PageResult<Video> pageListVideos(Integer size, Integer page, String area);

    void viewVideoOnlineBySlices(HttpServletRequest request, HttpServletResponse response, String url) throws Exception;

    Map<String, Object> getVideoDetails(Long videoId);

    List<Video> recommend(Long userId) throws TasteException;
}
