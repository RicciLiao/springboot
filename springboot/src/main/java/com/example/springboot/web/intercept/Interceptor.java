package com.example.springboot.web.intercept;

import com.example.springboot.web.invoke.Invocation;

public interface Interceptor {
    public boolean before();
    public boolean after();
    public Object around(Invocation invocation) throws Throwable;
    public void afterReturning();
    public void afterThrowing();
    boolean useAround();
}
