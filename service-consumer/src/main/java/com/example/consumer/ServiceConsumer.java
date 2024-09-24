package com.example.consumer;

import com.example.provider.MyService;

import java.util.ServiceLoader;

public class ServiceConsumer {

    public static void main(String[] args) {
        ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);    
        for (MyService service : serviceLoader) {
            System.out.println(service.sayHello());
        }
    }
}