package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by anton on 11/25/2016.
 */
public class MainApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        IBlender blender = (IBlender) context.getBean("blender");
        blender.blend();

        ((IMachine) blender).start();

        IFan fan = (IFan) context.getBean("fan");
        fan.activate(5);

        ((IMachine) fan).start();

        context.close();


    }

}
