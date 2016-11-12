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

    public void snap(int exposure){
        System.out.println("SNAP exposure:" + exposure);
    }

    public String snap(String name){
        System.out.println("SNAP name:" + name);

        return name;
    }

    public void snapNightTime(){
        System.out.println("Snapping in Night Mode.");
    }
}
