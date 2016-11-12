package com.caveofprogramming.spring.aspect;

import org.springframework.stereotype.Component;

/**
 * Created by anton on 11/12/2016.
 */
@Component
public class Camera {

    public void snap(){
        System.out.println("SNAP");
    }
}
