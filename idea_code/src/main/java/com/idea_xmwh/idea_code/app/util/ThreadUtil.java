package com.idea_xmwh.idea_code.app.util;

import com.idea_xmwh.idea_code.app.service.asynTread.AsynThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName ThreadUtil
 * @Author Mengjw
 * @date 2020.09.03 09:02
 */
@Component
public class ThreadUtil {
    @Autowired
    private AsynThreadService asynThreadService;

    @Scheduled(fixedDelay = 50000)
    public void asynThreadTask() throws InterruptedException {
        asynThreadService.asynThreadTask1();
        asynThreadService.asynThreadTask2();
        asynThreadService.asynThreadTask3();
        asynThreadService.asynThreadTask4();
    }


}
