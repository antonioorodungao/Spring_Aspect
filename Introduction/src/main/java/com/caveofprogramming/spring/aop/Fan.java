package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by anton on 11/25/2016.
 */

@Component
public class Fan implements IFan {
    public void activate(int i) {
        System.out.println("Activating fan at level " + i);
    }
}
