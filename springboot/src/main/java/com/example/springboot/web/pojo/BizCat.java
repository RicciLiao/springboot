package com.example.springboot.web.pojo;

import com.example.springboot.web.pojo.definition.Animal;
import org.springframework.stereotype.Component;

@Component
public class BizCat implements Animal {
    @Override
    public void use() {
        System.out.println("猫【"+BizCat.class.getSimpleName()+"】是抓老鼠的。。。");
    }
}
