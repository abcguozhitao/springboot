package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: gzt0908
 * @Date: 2019/2/24 11:28
 * @Description:springboot 测试
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    private String index() {
        System.out.println("default index.");
        return "index";
    }


    @RequestMapping("/hello2")
    private String index2() {
        System.out.println("index2 enter.");
        return "index";
    }

    @RequestMapping("/hello3")
    private ModelAndView index3() {
        System.out.println("ModelAndView...");
        return new ModelAndView("index");
    }

    @RequestMapping("/index4")
    private String index4() {
        System.out.println("index4 enter.");
        return "index.html";
    }
}
