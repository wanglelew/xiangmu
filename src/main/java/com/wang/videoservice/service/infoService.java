package com.wang.videoservice.service;

import com.wang.videoservice.entity.Info;
import com.wang.videoservice.mapper.InfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author wanglele
 * @Classname infoService
 * @Describe:
 * @date 2021/6/4 16:39
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class infoService {
    @Resource
    private InfoMapper infoMapper;

    public void findByArtcileId(Info info){
        infoMapper.insertSelective(info);
    }
}
