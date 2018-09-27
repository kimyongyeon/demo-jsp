package com.example.demotemplatejsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("tab")
    public String tab(){
        return "tab";
    }

    @RequestMapping("nestedlayout")
    public String nestedlayout(){
        return "nestedlayout";
    }

    @RequestMapping("datagrid")
    public String datagrid(){
        return "datagrid";
    }
}
