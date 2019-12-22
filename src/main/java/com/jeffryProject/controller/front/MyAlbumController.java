package com.jeffryProject.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyAlbumController {
    //我的相册
    @RequestMapping("/myAlbum")
    public String myAlbum(){
        return "front/my_album";
    }
}
