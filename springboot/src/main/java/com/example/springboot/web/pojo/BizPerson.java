package com.example.springboot.web.pojo;

import com.example.springboot.web.pojo.definition.Animal;
import com.example.springboot.web.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BizPerson implements Person {

    @Autowired
    private Animal bizDog;

    @Autowired
    private Animal bizCat;

    @Override
    public void service() {
        this.bizDog.use();
        this.bizCat.use();
    }
}
