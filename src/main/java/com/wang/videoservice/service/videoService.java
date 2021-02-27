package com.wang.videoservice.service;

import com.wang.videoservice.entity.Video;
import com.wang.videoservice.mapper.videoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author 王乐乐 WLL
 * @Classname videoService
 * @Describe:
 * @date 2021/2/26 14:16
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class videoService {
    @Resource
    private videoMapper videoMapper;

    public Video findByArtcileId(Long atricleId){
        return videoMapper.findByArticleId(atricleId);
    }
}
