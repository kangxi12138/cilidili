package com.github.codeman.cilidili.repository;

import com.github.codeman.cilidili.domain.UserInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends ElasticsearchRepository<UserInfo,Long> {

}
