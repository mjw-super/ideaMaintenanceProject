package com.idea_xmwh.idea_code.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Project Name:spxt
 * File Name:DemoController2
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/2 20:42   zhongcg         1.0       1.0 Version
 **/
@RestController
@RequestMapping("/demo")
public class DemoController2 {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
