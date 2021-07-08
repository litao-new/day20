package com.ujiuye.servlet;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.bean.Student;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jsonServlet")
public class JsonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //对象类型
        //Student stu = new Student(1,"mary","girl","12345567788","mary@qq.com");
        //ObjectMapper mapper = new ObjectMapper();
        //String res= mapper.writeValueAsString(stu);

        //数组类型
//        String[] arr ={"123","abc","gg"};
//        ObjectMapper mapper = new ObjectMapper();
//        String res = mapper.writeValueAsString(arr);
//
        //混合类型
        Student stu1 = new Student(1,"mary","girl","12345567788","mary@qq.com");
        Student stu2 = new Student(2,"jack","boy","123455688","jack@qq.com");
        Student stu3 = new Student(3,"tom","boy","123567788","tom@qq.com");
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(list);


        System.out.println(res);
        PrintWriter out = response.getWriter();//把数据返回给前端
        out.print(res);
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
