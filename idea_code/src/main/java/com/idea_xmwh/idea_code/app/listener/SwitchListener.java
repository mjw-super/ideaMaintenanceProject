package com.idea_xmwh.idea_code.app.listener;

import com.idea_xmwh.idea_code.app.po.MyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName SwitchListener
 * @Author Mengjw
 * @date 2020.09.09 17:29
 */
@Component
public class SwitchListener {

    private int count = 0;
    private int sumCount = 0;

    @EventListener
    public void event(MyEvent event) {
        /**
         * 括号中的参数不能为空，可以任意
         * 若为Object event，则所有事件都可以监听到
         */
        System.out.println("MyEventHandler又要监听"+event.getClass());

    }


//    /**
//     *  Redis内session过期事件监听
//     */
//    @EventListener
//    public void onSessionExpired(SessionExpiredEvent expiredEvent) {
//        String sessionId = expiredEvent.getSessionId();
//        count--;
//        System.out.println("过期sessionId=={"+sessionId+"} ----,count-- 人数数量=={"+count+"}");
//    }
//
//
//    /**
//     * Redis内session删除事件监听
//     */
//    @EventListener
//    public void onSessionDeleted(SessionDeletedEvent deletedEvent) {
//        String sessionId = deletedEvent.getSessionId();
//        count--;
//        System.out.println("销毁sessionId=={"+sessionId+"} ----,count-- 人数数量=={"+count+"}");
//    }
//
//    /**
//     * Redis内session保存事件监听
//     */
//    @EventListener
//    public void onSessionCreated(SessionCreatedEvent createdEvent) {
//        String sessionId = createdEvent.getSessionId();
//        count++;
//        System.out.println("创建sessionId=={"+sessionId+"} ----,count-- 人数数量=={"+count+"}");
//        sumCount++;
//        System.out.println("总量=={"+sumCount+"}");
//    }

}
