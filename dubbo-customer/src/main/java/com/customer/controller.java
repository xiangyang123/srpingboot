package com.customer;

import com.service.CommonService;
import com.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zouxiang on 2017/7/10.
 */
@Controller
public class controller {

    @Resource
    private CommonService commonService;
    @Resource
    private TestService testService;
    @RequestMapping(value = "/" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test(){
        System.out.println(commonService.sayYes());
        System.out.println(testService.sayHello(" zouxiang!"));
        return commonService.sayHello("hello world zookeeper+dubbo");
    }
}
