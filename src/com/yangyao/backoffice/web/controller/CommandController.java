package com.yangyao.backoffice.web.controller;


import com.yangyao.backoffice.model.User;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class CommandController extends AbstractCommandController {
//    public CommandController(){
//        //����springmvc�ѱ����ݴ���userģ����ȥ
//        this.setCommandClass(User.class);
//    }
//    @Override
//    protected ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object o, BindException e) throws Exception {
//        User user=(User)o;
//        System.out.println(user.toString());
//        ModelAndView mav=new ModelAndView();
//        mav.setViewName("user/info");
//        mav.addObject("user",user);
//        return mav;
//    }
//}
