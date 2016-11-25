package com.caveofprogramming.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by anton on 11/25/2016.
 */

@Component
@Aspect
public class MachineAspect {

    //    declaring parent beans, calls beans to implement interface
    @DeclareParents(value = "com.caveofprogramming.spring.aop.*", defaultImpl = com.caveofprogramming.spring.aop.Machine.class)
    //tells which beans will implement the interface, and where is the implementation of the interface
    private IMachine machine;

    @Around("within(com.caveofprogramming.spring.aop.*)")
    public void runningMachine(ProceedingJoinPoint jp) {
        System.out.println("Running...");
        try {

            jp.proceed();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("...completed.");
    }

}
