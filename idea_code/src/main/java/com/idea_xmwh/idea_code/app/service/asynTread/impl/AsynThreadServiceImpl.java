package com.idea_xmwh.idea_code.app.service.asynTread.impl;

import com.idea_xmwh.idea_code.app.service.asynTread.AsynThreadService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @Description
 * @ClassName AsynThreadServiceImpl
 * @Author Mengjw
 * @date 2020.09.04 15:41
 */
@Service
public class AsynThreadServiceImpl implements AsynThreadService {
    public void asynThreadTask1(){
        System.out.println("test1-------------------");
    }
    public void asynThreadTask2(){
        System.out.println("test2-------------------");
    }
    /**
     * 获取异步结果
     * @return
     * @throws InterruptedException
     */
    @Async
    public Future<String> asynThreadTask3(){
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("任务3耗时="+(end-begin));
        return new AsyncResult<String>("任务3");
    }
    @Async
    public Future<String> asynThreadTask4(){
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("任务4耗时="+(end-begin));
        return new AsyncResult<String>("任务4");
    }
}
