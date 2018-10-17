package com.example.springboot.web.config;

import com.example.springboot.web.intercept.impl.MyInterceptor;
import com.example.springboot.web.proxy.ProxyBean;
import com.example.springboot.web.service.HelloService;
import com.example.springboot.web.service.impl.HelloServiceImpl;

public class AOPTest {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        System.out.println("################ when name is 'RicciLiao' ################");
        proxy.sayHi("RicciLiao");
        System.out.println("################ when name is null ################");
        proxy.sayHello(null);
    }
}
