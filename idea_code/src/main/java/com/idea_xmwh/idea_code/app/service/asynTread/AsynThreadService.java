package com.idea_xmwh.idea_code.app.service.asynTread;

import java.util.concurrent.Future;

/**
 * @Description
 * @ClassName AsynThreadService
 * @Author Mengjw
 * @date 2020.09.04 15:35
 */
public interface AsynThreadService {
    void asynThreadTask1();
    void asynThreadTask2();
    Future<String> asynThreadTask3();
    Future<String> asynThreadTask4();
}
