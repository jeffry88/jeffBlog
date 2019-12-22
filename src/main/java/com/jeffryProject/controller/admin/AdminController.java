package com.jeffryProject.controller.admin;

import com.jeffryProject.controller.BaseController;
import com.jeffryProject.entity.User;
import com.jeffryProject.error.CommonException;
import com.jeffryProject.error.EmCommError;
import com.jeffryProject.response.CommonReturnType;
import com.jeffryProject.service.AdminService;
import com.jeffryProject.viewobject.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerInterceptor;

@RequestMapping("/admin")
@Controller
@CrossOrigin(maxAge = 3600)
public class AdminController extends BaseController implements HandlerInterceptor {
    @Autowired
    private AdminService adminService;


    @RequestMapping(value = "/getAdmin", method = {RequestMethod.POST}, consumes = {"application/json"})
    @ResponseBody
    public CommonReturnType getAdmin() throws CommonException {
        int id = 100001;
        User user = this.adminService.findUserByUid(id);
        if (user == null) {
            throw new CommonException(EmCommError.USER_NOT_EXIST);
        }
        //将核心领域模型用户对象转化成可供UI使用的viewobject

        UserVO userVO = converFromModel(user);

        return CommonReturnType.create(userVO);
    }

    //后台用户登录验证
    @RequestMapping(value = "/adminLogin", method = {RequestMethod.POST})
    @ResponseBody
    public CommonReturnType adminLogin(@RequestParam("username") String username,@RequestParam("password") String password) throws CommonException {
        User user = this.adminService.findUserByUsername(username);
        if (user == null) {
            throw new CommonException(EmCommError.USER_NOT_EXIST);
        }
        //将核心领域模型用户对象转化成可供UI使用的viewobject
        return CommonReturnType.create(user);
    }

    //创建新用户
    @RequestMapping(value = "/createUser",method = {RequestMethod.POST})
    @ResponseBody
    public CommonReturnType createUser(@RequestBody User user) throws CommonException{

        return CommonReturnType.create(user);
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
