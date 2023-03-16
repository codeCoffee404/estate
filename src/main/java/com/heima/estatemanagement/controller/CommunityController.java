package com.heima.estatemanagement.controller;

import com.heima.estatemanagement.common.Result;
import com.heima.estatemanagement.domain.Community;
import com.heima.estatemanagement.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author codeCoffeeSxs
 * @Date 2023/3/16 18:06
 * @Version 1.0
 * @Description：小区管理控制
 * @RestController
 */
@RestController
@RequestMapping("/community")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @RequestMapping("/find")
    public Result find(){
        List<Community> all = communityService.findAll();
        return new Result(false,200,"请求成功",all);
    }


}
