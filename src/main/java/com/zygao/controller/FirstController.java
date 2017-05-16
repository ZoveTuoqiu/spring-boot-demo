package com.zygao.controller;

import com.zygao.model.conf.FirstConfBean;
import com.zygao.model.conf.MyConfBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaoziye on 2017/5/8.
 */
@RestController
public class FirstController {

    @Value("${first.prop.name}")
    private String name;

    @Value("${first.prop.value}")
    private String value;

    @Autowired
    FirstConfBean confBean;

    @Autowired
    MyConfBean myConfBean;

    @RequestMapping("/")
    public String index(){
        return name + " " + value;
    }

    @RequestMapping("/mix/")
    public String mix(){
        return "mix:" + confBean.getName() + " " + confBean.getValue();
    }

    @RequestMapping("/concat/")
    public String concat(){
        return myConfBean.getConcat();
    }
}
