package com.emotte.springboot_test.controller;


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
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("title", "测试");
        model.addAttribute("atext", "这个冬天不太Cool");
        return "index";
    }

}
