package com.idea_xmwh.idea_code.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Description
 * @ClassName LogAcpect
 * @Author Mengjw
 * @date 2020.09.06 10:39
 */
@Aspect
@Component
public class LogAcpect {
    private Logger logger = LoggerFactory.getLogger(LogAcpect.class);

    /**
     * 定义切入点
     */
    @Pointcut("execution(public * com.idea_xmwh.idea_code.app.service..*.*(..))")
    public void Log() {
    }

    /**
     * 前置通知：在连接点之前执行的通知
     *
     * @param joinPoint
     * @throws Throwable
     */
    @Before("Log()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret", pointcut = "Log()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
    }

    @AfterThrowing(value = "Log()", throwing = "e")
    public void afterThrowing(Exception e) {
        //系统异常时封装异常抛出
        logger.error(e.getMessage(), e);
        throw new RuntimeException(e.getMessage(), e);
    }
}
