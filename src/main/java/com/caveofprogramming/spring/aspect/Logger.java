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

    //.. in method as wild card to call overloaded methods
//    @Pointcut("execution(void com.caveofprogramming.spring.aspect.Camera.snap(..))")
    @Pointcut("execution(* com.caveofprogramming.spring.aspect.Camera.*(..))")
    public void cameraSnap(){

    }

    @Pointcut("execution(String com.caveofprogramming.spring.aspect.Camera.snap(String))")
    public void cameraSnapName(){

    }

    //Possible also for the pointcut to have "execution(* *.*(..))"
    @Pointcut("execution(* com.caveofprogramming.spring.aspect.*.*(..))")
    public void cameraRelatedAction(){

    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto(){
        System.out.println("About to take photo.");
    }

    @Before("cameraSnapName()")
    public void aboutToTakePhotoWithName(){
        System.out.println("About to take photo with name");
    }

    @Before("cameraRelatedAction()")
    public void doingCameraRelatedAction(){
        System.out.println("Doing camera related action");
    }
}

