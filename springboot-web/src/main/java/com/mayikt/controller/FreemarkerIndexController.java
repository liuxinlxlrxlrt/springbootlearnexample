package com.mayikt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class FreemarkerIndexController {

    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(Map<String,String> result,HttpServletRequest request){
        //转发到页面展示数据 name value=mayikt
        result.put("name","mayikt");
//        request.setAttribute("name","mayikt");
        return "freemarkerIndex";
    }
}
