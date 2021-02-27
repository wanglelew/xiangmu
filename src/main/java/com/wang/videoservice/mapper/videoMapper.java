package com.wang.videoservice.mapper;

import com.wang.videoservice.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 王乐乐 WLL
 * @Classname videoMapper
 * @Describe:
 * @date 2021/2/26 11:49
 */
@Mapper
public interface videoMapper {
    @Select("select * from video where article_id=#{value}")
    public Video findByArticleId(Long atricleId);

}
