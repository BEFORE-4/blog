package com.blog.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * com.blog.controller.*.*(..))")
    public void logAspect(){}

    @Before("logAspect()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("doBefore");
    }

    @After("logAspect()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("doAfter");
    }

    @AfterReturning("logAspect()")
    public void doAfterReturning(JoinPoint joinPoint){
        System.out.println("doAfterReturning");
    }

    @AfterThrowing("logAspect()")
    public void doAfterThrowing(JoinPoint joinPoint){
        System.out.println("doAfterThrowing");
    }

    @Around("logAspect()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("doAround");
        return joinPoint.proceed();
    }

}
