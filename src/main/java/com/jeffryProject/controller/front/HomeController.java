package com.jeffryProject.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "front/index";
    }
    @RequestMapping("/index")
    public String index(){
        return "front/index";
    }
}
