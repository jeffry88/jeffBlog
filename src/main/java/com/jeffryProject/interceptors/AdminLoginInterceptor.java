package com.jeffryProject.interceptors;

import com.jeffryProject.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.util.ObjectUtils.isEmpty;

@Component
public class AdminLoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("在请求处理之前进行调用（Controller方法调用之前）");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("USER_INFO");
//        if (isEmpty(user)) {
//            Map<Object,Object> res = new HashMap<Object, Object>();
//            res.put("status","fail");
//            res.put("code",5000);
//            res.put("msg","用户未登录");
//            PrintWriter out = response.getWriter();
//            out.append(res.toString());
//            return false;
//        }
        return true;// 只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(">>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

}
