package com.caveofprogramming.spring.aspect.accessories;

import org.springframework.stereotype.Component;

/**
 * Created by anton on 11/12/2016.
 */

@Component
public class Lens {

    public void zoom(int factor){
        System.out.println("Zooming lens by" + factor);
    }

}
