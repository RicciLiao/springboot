package com.example.springboot.web.pojo;

import com.example.springboot.web.pojo.definition.Animal;
import org.springframework.stereotype.Component;

@Component
public class BizDog implements Animal {
    @Override
    public void use() {
        System.out.println("狗【"+BizDog.class.getSimpleName()+"】是用来看门的。。。");
    }
}
