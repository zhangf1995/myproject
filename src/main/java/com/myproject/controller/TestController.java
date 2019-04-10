package com.myproject.controller;

import com.myproject.consts.WebConsts;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: myproject
 * @description: 测试接口
 * @author: zf
 * @create: 2019-04-07 10:36
 **/
@RestController
@RequestMapping(WebConsts.URL_TEST)
public class TestController {

    @RequestMapping("/test1")
    public Integer test1(){
        int a = 1/0;
        return a;
    }
}
