package com.walker.dubbo.learning;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getLocationData() {
        return "这里是深圳市南山区";
    }
}
