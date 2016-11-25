package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by anton on 11/25/2016.
 */

@Component
public class Blender implements IBlender {
    public void blend() {
        System.out.println("Blending...");
    }
}
