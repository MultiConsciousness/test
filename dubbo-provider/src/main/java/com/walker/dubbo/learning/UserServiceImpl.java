package com.walker.dubbo.learning;


import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName() {
        return "我是一个学习dubbo-zookeeper的人";
    }
}
