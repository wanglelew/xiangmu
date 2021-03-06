package com.wang.videoservice.controller;

import com.wang.videoservice.dto.ResultVo;
import com.wang.videoservice.entity.Video;
import com.wang.videoservice.service.videoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 王乐乐 WLL
 * @Classname VideoController
 * @Describe:
 * @date 2021/2/26 14:20
 */
@RestController
public class VideoController {
    @Resource
    private videoService videoService;
    @GetMapping("/getVideo")
    private ResultVo<Video> getByArtcileId(Long articleId){
        System.out.println(11);
        Video id = videoService.findByArtcileId(articleId);
        return new ResultVo<>(id);
    }
}
