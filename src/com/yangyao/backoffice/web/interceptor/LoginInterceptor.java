package com.yangyao.backoffice.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /**
         * 拦截
         * 1.排除不需要拦截路径
         */
        System.out.println("客户端访问资源的路径："+request.getRequestURI());
        if(request.getRequestURI().endsWith("login.do")){
            return true;
        }
        //2.如果登陆了，也要放行
        if (request.getSession().getAttribute("username")!=null){
            return true;
        }
        //3.进入到login界面
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("未返回视图前 后处理。。。。");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("返回视图前 后处理。。。");
    }
}
