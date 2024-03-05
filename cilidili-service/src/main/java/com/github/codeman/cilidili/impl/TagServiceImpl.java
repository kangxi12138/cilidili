package com.github.codeman.cilidili.impl;

import com.github.codeman.cilidili.domain.Tag;
import com.github.codeman.cilidili.mapper.TagMapper;
import com.github.codeman.cilidili.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author kangxi
* @description 针对表【t_tag(标签表)】的数据库操作Service实现
* @createDate 2024-01-25 22:15:54
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService {

}




