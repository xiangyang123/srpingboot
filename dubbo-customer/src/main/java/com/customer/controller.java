package com.customer;

import bean.User;
import com.alibaba.dubbo.common.json.JSON;
import com.service.CommonService;
import com.service.TestService;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by zouxiang on 2017/7/10.
 */
@Controller
public class controller {

    @Resource
    private CommonService commonService;
    @Resource
    private TestService testService;
    @Resource
    private UserService userService;
    @RequestMapping(value = "/" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test(){
        System.out.println(commonService.sayYes());
        System.out.println(testService.sayHello(" zouxiang!"));
        return commonService.sayHello("hello world zookeeper+dubbo");
    }

    @ResponseBody
    @RequestMapping(value = "/findAll")
    public String findAll() throws IOException {
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user.getName());
        }
        return JSON.json(users);
    }



}
