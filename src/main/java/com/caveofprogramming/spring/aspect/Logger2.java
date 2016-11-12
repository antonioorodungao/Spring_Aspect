package com.caveofprogramming.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by anton on 11/12/2016.
 */

@Aspect
@Component
public class Logger2 {

    @Pointcut("execution(* com.caveofprogramming.spring.aspect.Camera.snap(..))")
    public void cameraSnap() {

    }

    //before the method is run
    @Before("cameraSnap()")
    public void beforeAdvice() {
        System.out.println("Before advice");
    }

    //after the method is run
    @After("cameraSnap()")
    public void afterAdvice() {
        System.out.println("After Advice");
    }

    //after the method is run successfully
    @AfterReturning("cameraSnap()")
    public void afterReturningaAdvice() {
        System.out.println("Returning advice");
    }

    //after the method throws an exception
    @AfterThrowing("cameraSnap()")
    public void afterThrowing() {
        System.out.println("After Throwing");
    }

    //around before and after advice
    @Around("cameraSnap()")
    public void aroundAdvice(ProceedingJoinPoint p) {

        System.out.println("Around advice (before)");

        try {
            p.proceed();
        } catch (Throwable throwable) {
            System.out.println("In around advice " + throwable.getMessage());
        }

        System.out.println("Around advice (after)");
    }

}
