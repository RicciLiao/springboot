package com.example.springboot.web.intercept.impl;

import com.example.springboot.web.intercept.Interceptor;
import com.example.springboot.web.invoke.Invocation;

public class MyInterceptor implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("before ........");
        return true;
    }

    @Override
    public boolean after() {
        System.out.println("after ........");
        return true;
    }

    @Override
    public Object around(Invocation invocation) throws Throwable {
        System.out.println("around before ........");
        Object obj = invocation.proceed();
        System.out.println("around after ........");
        return obj;
    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning ........");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing ........");
    }

    @Override
    public boolean useAround() {
        return true;
    }
}
