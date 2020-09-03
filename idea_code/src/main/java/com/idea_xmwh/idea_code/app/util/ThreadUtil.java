package com.idea_xmwh.idea_code.app.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @Description
 * @ClassName ThreadUtil
 * @Author Mengjw
 * @date 2020.09.03 09:02
 */
@Service
public class ThreadUtil {
    public void asynThread() throws InterruptedException {
        this.test1();
        Future<String> task4 = this.task4();
        Future<String> task6 = this.task6();
        this.test2();
    }
    public void test1(){
        System.out.println("test1-------------------");
    }
    public void test2(){
        System.out.println("test2-------------------");
    }
    /**
     * 获取异步结果
     * @return
     * @throws InterruptedException
     */
    @Async
    public Future<String> task4() throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread.sleep(2000L);
        long end = System.currentTimeMillis();
        System.out.println("任务4耗时="+(end-begin));
        return new AsyncResult<String>("任务4");
    }
    @Async
    public Future<String> task6() throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread.sleep(1000L);
        long end = System.currentTimeMillis();
        System.out.println("任务6耗时="+(end-begin));
        return new AsyncResult<String>("任务6");
    }

}
