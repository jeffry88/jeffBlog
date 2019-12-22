package com.jeffryProject.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class InfoController {
    //内容页
    @RequestMapping("/info")
    public String info() {
        return "front/info";
    }

    //内容页
    @RequestMapping("/infoPic")
    public String infoPic() {
        return "front/infopic";
    }
}
