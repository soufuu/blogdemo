package com.sofuu.blogdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 */

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.sofuu.blogdemo.controller.*.*(..))")
   public void log(){}

   @Before("log()")
   public void doBefore(){

   }

    @After("log()")
    public void doAfter(){

    }
}
