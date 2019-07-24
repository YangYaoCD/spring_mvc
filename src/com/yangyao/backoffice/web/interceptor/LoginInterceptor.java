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
         * ����
         * 1.�ų�����Ҫ����·��
         */
        System.out.println("�ͻ��˷�����Դ��·����"+request.getRequestURI());
        if(request.getRequestURI().endsWith("login.do")){
            return true;
        }
        //2.�����½�ˣ�ҲҪ����
        if (request.getSession().getAttribute("username")!=null){
            return true;
        }
        //3.���뵽login����
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("δ������ͼǰ ����������");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("������ͼǰ ��������");
    }
}
