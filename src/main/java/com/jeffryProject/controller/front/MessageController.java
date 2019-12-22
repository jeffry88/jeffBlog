package com.jeffryProject.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MessageController {
    //留言
    @RequestMapping("/message")
    public String message() {
        return "front/message";
    }
}
