package com.provider.service.impl;


import com.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by zouxiang on 2017/7/10.
 */
@Service("testService")
public class TestServiceImpl implements TestService
{
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
