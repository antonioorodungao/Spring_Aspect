package com.caveofprogramming.spring.aspect;

import com.caveofprogramming.spring.aspect.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by anton on 11/12/2016.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Camera camera = (Camera)context.getBean("camera");
        Lens lens = (Lens) context.getBean("lens");

        try {
            camera.snap();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        camera.snap(1500);
        camera.snap("Bahrain Castle");
        lens.zoom(5);
        context.close();

    }
}
