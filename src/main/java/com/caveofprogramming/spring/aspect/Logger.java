package com.caveofprogramming.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by anton on 11/12/2016.
 */

@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.caveofprogramming.spring.aspect.Camera.snap())")
    public void cameraSnap(){

    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto(){
        System.out.println("About to take photo.");
    }
}
