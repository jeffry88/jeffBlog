package com.jeffryProject.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AboutController {
    //关于我
    @RequestMapping("/about")
    public String about() {
        return "front/about";
    }
}
