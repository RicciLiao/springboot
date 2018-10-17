package com.example.springboot.web.service.impl;

import com.example.springboot.web.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if(name == null || name.trim().equals("")){
            throw new RuntimeException("name is null !");
        } else {
            System.out.println("hello " + name + " !");
        }
    }

    @Override
    public void sayHi(String name) {
        if(name == null || name.trim().equals("")){
            throw new RuntimeException("name is null !");
        } else {
            System.out.println("hi " + name + " !");
        }
    }
}

