package com.github.codeman.cilidili.mapper;

import com.github.codeman.cilidili.domain.File;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kangxi
* @description 针对表【t_file(上传文件信息表)】的数据库操作Mapper
* @createDate 2024-01-25 20:27:18
* @Entity com.github.codeman.cilidili.domain.File
*/
@Mapper
public interface FileMapper extends BaseMapper<File> {

}




