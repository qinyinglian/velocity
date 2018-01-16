package com.github.qinyinglian;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinyinglian on 2017/3/5.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String excute() {
        System.out.print("hello ...");
        return "hello world spring boot";
    }
}
