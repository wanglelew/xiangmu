package com.wang.videoservice.mapper;


import com.wang.videoservice.entity.Info;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoMapper {

    @Insert("INSERT INTO `info`(`phone`, `name`) VALUES (#{phone}, #{name})")
    void insertSelective(Info record);


}