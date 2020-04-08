package com.jeffryProject.controller.admin;

import com.alibaba.fastjson.JSON;
import com.jeffryProject.controller.BaseController;
import com.jeffryProject.dao.UserMapper;
import com.jeffryProject.entity.User;
import com.jeffryProject.error.CommonException;
import com.jeffryProject.error.EmCommError;
import com.jeffryProject.response.CommonReturnType;
import com.jeffryProject.service.AdminService;
import com.jeffryProject.utils.SerializeUtil;
import com.jeffryProject.viewobject.UserVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.util.ObjectUtils.isEmpty;

@RequestMapping("/admin")
@Controller
@CrossOrigin(maxAge = 3600)
public class AdminController extends BaseController implements HandlerInterceptor {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/getAdmin", method = {RequestMethod.POST})
    @ResponseBody
    public CommonReturnType getAdmin() throws CommonException {
        int uid = 100001;
        User user = this.adminService.findUserByUid(uid);
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
    public CommonReturnType adminLogin(HttpServletRequest request,@RequestParam("logName") String logName,@RequestParam("password") String password) throws CommonException {
        //校验参数
        if (StringUtils.isEmpty(logName)||StringUtils.isEmpty(password)){
            throw new CommonException(EmCommError.PARMETER_VALIDATION_ERROR);
        }
        //服务层校验用户登录是否合法
        User user = adminService.validateLogin(logName,password);
        System.out.println(user);
        HttpSession session = request.getSession();
        User logUser = (User) session.getAttribute("LOGIN_USER");
        if (isEmpty(logUser)) {//用户未登录
            //将用户信息存入session
            session.setAttribute("LOGIN_USER",user);
            session.setMaxInactiveInterval(120*60);//设置session过期时间为120分钟
        }
        //将核心领域模型用户对象转化成可供UI使用的viewobject
        return CommonReturnType.create(true);
    }

    //创建新用户
    @RequestMapping(value = "/createUser",method = {RequestMethod.POST})
    @ResponseBody
    public CommonReturnType createUser(@RequestBody User user) throws CommonException{
        //判断用户是否有创建用户的权限

        //创建用户流程

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
