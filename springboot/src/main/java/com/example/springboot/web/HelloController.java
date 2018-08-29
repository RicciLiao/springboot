package com.example.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
        @Value("${application.message: Hello World}")
        private String message = "Hello World";

        @RequestMapping("/index")
        public String main () {
            return "index";
        }

        @RequestMapping("/welcome")
        public String welcome(){
            return "welcome";
        }
}
