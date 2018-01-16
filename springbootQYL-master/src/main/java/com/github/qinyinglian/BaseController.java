package com.github.qinyinglian;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qinyinglian on 2017/5/4.
 */
@Controller
public class BaseController  {

    /**
     * 查看某人信息
     * @return
     */
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public String select(String name, String id) {
        return "test";
    }


    /**
     * 删除某人信息
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(String name, String id) {
        return "success";
    }

    /**
     * 测试
     * @return
     */
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(String name, String id, Model model) {
        try{
              model.addAttribute("name","test");
        } catch (Exception e){
             System.out.print(e);
        }
        return "test";
    }
}
