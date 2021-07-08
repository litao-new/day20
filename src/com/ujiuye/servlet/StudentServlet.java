package com.ujiuye.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.bean.Student;
import com.ujiuye.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //出来字符乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        //获取前端传送数据
        String sname = request.getParameter("sname");
        //创建service对象
        StudentServiceImpl ss = new StudentServiceImpl();
        //调用方法传入参数
        List<Student> list= ss.studentService(sname);
        //响应到前端页面
        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(list);
        //写出
        PrintWriter out = response.getWriter();
        out.print(res);
        out.close();


    }
}
