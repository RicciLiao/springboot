package com.example.springboot.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.springboot.web.pojo")
public class AppConfig {
}
