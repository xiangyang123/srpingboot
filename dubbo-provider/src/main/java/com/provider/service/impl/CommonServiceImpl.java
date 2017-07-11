package com.provider.service.impl;

import com.service.CommonService;

/**
 * Created by zouxiang on 2017/7/10.
 */
public class CommonServiceImpl implements CommonService{
    public String sayHello(String name) {
        return "nihao "+name;
    }

    @Override
    public String sayYes() {
        return "yes";
    }
}
