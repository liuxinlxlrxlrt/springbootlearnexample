package com.mayikt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class FreemarkerIndexController {

    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(Map<String,Object> result,HttpServletRequest request){
        //转发到页面展示数据 name value=mayikt
        result.put("name","mayikt");
        //0为男，1为女
        result.put("sex","0");
        result.put("age",22);
        ArrayList<String> userList = new ArrayList<>();
        userList.add("mayikt");
        userList.add("xiaowei");
        result.put("userList",userList);
//        request.setAttribute("name","mayikt");
        return  "freemarkerIndex";
    }
}
