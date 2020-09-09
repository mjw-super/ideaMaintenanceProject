package com.idea_xmwh.idea_code.app.po;

import org.springframework.context.ApplicationEvent;

/**
 * @Description
 * @ClassName MyEvent
 * @Author Mengjw
 * @date 2020.09.09 17:40
 */
public class MyEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    public MyEvent(Object source) {
        super(source);
    }
}
