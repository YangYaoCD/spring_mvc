package com.yangyao.backoffice.web.controller;

import com.yangyao.backoffice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController{


    @RequestMapping(value = "list")
    public String list(Model model)
    {
        //模拟数据库取数据
        List<User> userList=new ArrayList<User>();
        User user1=new User("杨垚","男","22",1);
        User user2=new User("周鑫","男","22",2);
        User user3=new User("王帅琪","男","22",3);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        model.addAttribute("userList",userList);
        return "user/userlist";

    }
    @RequestMapping(value = "toRegister",method = RequestMethod.GET)
    public String toRegister(){
        return "user/register";
    }

    @RequestMapping("register")
    public String register(User user){
        System.out.println(user.toString());
        return "user/info";
    }

    @RequestMapping("/save")
    public String save(){
        return null;
    }

    @RequestMapping("/update")
    public String update(){
        return null;
    }

    @RequestMapping("/delete")
    public String delete(){
        return null;
    }


    //两种传参方式
    @RequestMapping("/edit")
    public String edit(Integer id,Model model){
        System.out.println("接受到的id号:"+id);

        //假设从数据库查找
        User user=new User("杨垚","男","22",id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }

    @RequestMapping("/edit2/{id}")
    public String edit2(@PathVariable Integer id, Model model){
        System.out.println("接受到的id号:"+id);

        //假设从数据库查找
        User user=new User("杨垚","男","22",id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }


    @RequestMapping("/test1")
    public  String test1(){
        return "forward:list.do";
    }

    @RequestMapping("/login")
    public  String login(String username, String password, HttpSession session)
    {
        if ("yy".equals(username)&&"123".equals(password)){
//            1.保存session
            session.setAttribute("username",username);
        }
        return "user/info";
    }
}
