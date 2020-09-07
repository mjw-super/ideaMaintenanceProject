package com.idea_xmwh.idea_code.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName DemoController
 * @Author Mengjw
 * @date 2020.09.02 17:58
 */
@RestController
@RequestMapping("/app")
public class DemoController {
    @GetMapping("/hello")
    public String helloWord(String name){
        String str = name+"你好啊！！！";
        return str;
    }
    @GetMapping("/hello1")
    public String helloWord1(String name){
        String str = name+"你好啊！！！";
        return str;
    }
    @GetMapping("/hello2")
    public String helloWord2(String name){
        String str = name+"你好啊！！！";
        return str;
    }
    @GetMapping("/hello3")
    public String helloWord3(String name){
        String str = name+"你好啊！！！";
        return str;
    }
    @GetMapping("/hello4")
    public String helloWord4(String name){
        String str = name+"你好啊！！！";
        return str;
    }
    @GetMapping("/hello5")
    public String helloWord5(String name){
        String str = name+"你好啊！！！";
        return str;
    }
    @GetMapping("/getHelloWord6")
    public String getHelloWord6(String name){
        String str = name+"你好啊！！！";
        return str;
    }
}
