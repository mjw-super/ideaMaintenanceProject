package com.idea_xmwh.idea_code.app.controller;

import com.idea_xmwh.idea_code.app.util.ThreadUtil;
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
    private ThreadUtil threadUtil;
    @GetMapping("/test")
    public void demoAsyn(){
        try {
            threadUtil.test1();
            threadUtil.task4();
            threadUtil.task6();
            threadUtil.test2();
//            threadUtil.asynThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
