package com.shark.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class TimeLogAspect {

    public static final Logger logger = LoggerFactory.getLogger(TimeLogAspect.class);

    @Around("execution(* *(..)) && @annotation(com.shark.example.aop.TimeLog)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getName();
        String methodName = methodSignature.getName();
        long startTime = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        logger.info(className + "." + methodName + ": " + totalTime);
        return result;
    }
}
