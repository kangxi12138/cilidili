package com.github.codeman.cilidili;

import com.github.codeman.cilidili.domain.UserInfo;
import com.github.codeman.cilidili.domain.Video;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ElasticSearchService {
    void addVideo(Video video);

    Video getVideo(String keyword);

    void deleteAllVideos();

    void addUserInfo(UserInfo userInfo);

    void deleteAllUserInfos();

    List<Map<String,Object>> getContents(String keyword, Integer pageNumber, Integer pageSize) throws IOException;
}
