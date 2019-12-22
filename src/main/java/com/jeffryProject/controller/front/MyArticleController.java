package com.jeffryProject.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyArticleController {
    //我的文章
    @RequestMapping("/myArticle")
    public String myArticle(){
        return "front/my_article";
    }
}
