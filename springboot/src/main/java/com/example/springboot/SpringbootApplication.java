package com.example.springboot;

import com.example.springboot.web.config.AppConfig;
import com.example.springboot.web.pojo.BizPerson;
import com.example.springboot.web.pojo.definition.Person;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;*/

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }


    /* Ricci:
    * 以下configure方法，当需要配置外部容器（Tomcat Service 等）时，需要解除注释，并修改配置文件
    * */
/*    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootApplication.class);
    }*/

}
