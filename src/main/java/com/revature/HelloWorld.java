package com.revature;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld{
    public void hello(){
        System.out.println("Hello world from Spring Beans!!");
    }
}