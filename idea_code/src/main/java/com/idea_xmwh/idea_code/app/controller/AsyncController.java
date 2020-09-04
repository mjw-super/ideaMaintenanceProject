package com.idea_xmwh.idea_code.app.controller;

import com.idea_xmwh.idea_code.app.service.asynTread.AsynThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName AsyncController
 * @Author Mengjw
 * @date 2020.09.03 09:27
 */
@RestController
@RequestMapping("/async")
public class AsyncController {
    @Autowired
    private AsynThreadService asynThreadService;
    @GetMapping("/test")
    public String demoAsyn(){
        String str = "线程开始！！！";
        try {
            asynThreadService.asynThreadTask1();
            asynThreadService.asynThreadTask2();
            asynThreadService.asynThreadTask3();
            asynThreadService.asynThreadTask4();
        } catch (Exception e) {
            e.printStackTrace();
            str = "线程异常！";
        }
        return str;
    }
}
