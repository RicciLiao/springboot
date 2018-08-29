package com.example.springboot.web.config;

import com.example.springboot.web.pojo.BizPerson;
import com.example.springboot.web.pojo.definition.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = ctx.getBean(BizPerson.class);
        person.service();
    }
}
