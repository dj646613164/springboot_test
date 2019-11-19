package com.emotte.springboot_test.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot_test
 * @description:
 * @author: dj
 * @create: 2019-10-31 14:05
 **/
@Controller
@Api(tags = {"打招呼的controller"})
public class HelloController {

    @ApiOperation(value = "说你好",httpMethod="GET")
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @ApiOperation(value = "跳转页面",httpMethod = "GET")
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("title", "测试");
        model.addAttribute("atext", "这个冬天不太Cool");
        return "index";
    }

}
