package com.yangyao.backoffice.web.controller;

import com.yangyao.backoffice.model.Student;
import com.yangyao.backoffice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    /**不同controller的转发
     * 重定向只需要将forward改成redirect就行
     * **/
    @RequestMapping(value = "test1")
    public String test1(){
        return "stu/stuRegister";
    }

    /**
     * RequestParam里面可以限制参数可不可以为空
     * @param uid
     * @return
     */
    @RequestMapping(value = "test2")
    public String test2(@RequestParam(value ="uid",required = true,defaultValue = "30") Integer uid){
        System.out.println(uid);
        return "forward:/user/list.do";
    }


    /**
     * @RequestBody:声明把json数据转换
     * @ResponseBody:声明把数据转成json
     *
     *
     */
    @RequestMapping(value = "save")
    public @ResponseBody Student save(@RequestBody Student student){
        return student;
    }

    @RequestMapping(value = "save1")
    public @ResponseBody Student save1(Student student){
        return student;
    }

    @RequestMapping(value = "get")
    public Student get(){
        Student student=new Student("杨垚","男");
        return student;
    }
    @RequestMapping(value = "te")
    public String te(){
        return "te/chuanjiandonghua";
    }
}
