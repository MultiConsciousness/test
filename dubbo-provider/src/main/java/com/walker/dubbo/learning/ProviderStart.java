package com.walker.dubbo.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderStart {
    
    public static void main(String[] args)throws IOException  {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-provider.xml");
        System.out.println(context.getDisplayName()+" start");
        context.start();
        System.in.read();
    }
}
