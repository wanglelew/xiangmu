package com.wang.videoservice.controller;


import com.wang.videoservice.dto.ResultVo;
import com.wang.videoservice.entity.Info;
import com.wang.videoservice.service.infoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wanglele
 * @Classname InfoController
 * @Describe:
 * @date 2021/6/4 16:42
 */
@RestController
public class InfoController {


    @Resource
    private infoService infoService;

    @RequestMapping("/insert")
    public ResultVo insert(@RequestBody Info info){
        if(info.getPhone().isEmpty()){
            return new ResultVo<>("手机号不能为空");
        }
        if(info.getName().isEmpty()){
            return new ResultVo<>("姓名不能为空");
        }
        if(info.getPhone().length()!=11){
            return new ResultVo<>("手机号格式错误");
        }

        infoService.findByArtcileId(info);
        return new ResultVo<>("成功");
    }



}
