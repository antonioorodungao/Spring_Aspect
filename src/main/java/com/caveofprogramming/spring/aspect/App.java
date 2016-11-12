package com.caveofprogramming.spring.aspect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by anton on 11/12/2016.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Camera camera = (Camera)context.getBean("camera");
        camera.snap();
        context.close();

    }
}
