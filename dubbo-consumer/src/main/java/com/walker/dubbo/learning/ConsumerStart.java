package com.walker.dubbo.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerStart {
    
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-consumer.xml");
        System.out.println("consumer context start");
        context.start();
        DemoService demoService = context.getBean(DemoService.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println("where am i: "+demoService.getLocationData());
        System.out.println("who am i :"+userService.getUserName());
    }
}
