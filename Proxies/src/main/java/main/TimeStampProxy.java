package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * Created by Krishna Kota on 06/06/21
 */
public class TimeStampProxy implements InvocationHandler {

    private Object delegate;

    private TimeStampProxy(Object delegate) {
        this.delegate = delegate;
    }

    public static Object getProxyFor(Object o) {
        return Proxy.newProxyInstance(
                o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),
                new TimeStampProxy(o));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(new Date());
        return method.invoke(delegate, args);
    }
}
