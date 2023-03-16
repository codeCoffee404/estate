package com.heima.estatemanagement.controller;

import com.heima.estatemanagement.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/find")
    public Result find(){
        return new Result(false,200,"请求成功SSSS");
    }


}
