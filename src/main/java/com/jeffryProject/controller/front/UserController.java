package com.jeffryProject.controller.front;

import com.jeffryProject.controller.BaseController;
import com.jeffryProject.entity.User;
import com.jeffryProject.error.CommonException;
import com.jeffryProject.error.EmCommError;
import com.jeffryProject.response.CommonReturnType;
import com.jeffryProject.service.UserService;
import com.jeffryProject.viewobject.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @RequestMapping("/findUser")
    public String findUser(Model model) {
        int id = 100001;
        User user = this.userService.findUserByUid(id);
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping("/login")
    public String logIn(Model model) {
        return "log_in";
    }

    @RequestMapping(value = "/getUser", method = {RequestMethod.POST}, consumes = {"application/json"})
    @ResponseBody
    public CommonReturnType getUser() throws CommonException {
        int id = 100001;
        User user = this.userService.findUserByUid(id);
        if (user == null) {
            throw new CommonException(EmCommError.USER_NOT_EXIST);
        }
        //将核心领域模型用户对象转化成可供UI使用的viewobject

        UserVO userVO = converFromModel(user);

        return CommonReturnType.create(userVO);
    }


    private UserVO converFromModel(User user) {
        if (user == null) {
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }
}