package com.yangyao.backoffice.web.controller;

import com.alibaba.fastjson.JSON;
import com.yangyao.backoffice.model.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "upload")
public class UploadController {


    @RequestMapping(value = "itemspic")
    public void itemspic(HttpServletRequest request, HttpServletResponse response) throws Exception {
        MultipartHttpServletRequest mreq= (MultipartHttpServletRequest) request;
        //1.��ȡͼƬ����
        MultipartFile mfile=mreq.getFile("itemspic1");

        //2.��ͼƬ������ĳ��·��
        //2.1�ļ�������ļ���·��
        String uploadFolder=request.getServletContext().getRealPath("/upload");
        File uploadFolderFile=new File(uploadFolder);
        if(!uploadFolderFile.exists()){
            uploadFolderFile.mkdirs();
        }
        //2.2�ļ�
        String suffix=mfile.getOriginalFilename().split("\\.")[1];
        String fileName= UUID.randomUUID().toString()+"."+suffix;
        String totalPath=uploadFolder+"/"+fileName;
        FileCopyUtils.copy(mfile.getInputStream(),new FileOutputStream(new File(totalPath)));

        //�������ݸ��ͻ���
        String IMGurl="http://localhost:8081/upload/"+fileName;
        String json = JSON.toJSONString(IMGurl);

        //��ӡjson���ͻ���
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(json);
        response.getWriter().flush();
    }

    @RequestMapping(value = "list")
    public String list(){
        return "user/userlist";
    }
}
