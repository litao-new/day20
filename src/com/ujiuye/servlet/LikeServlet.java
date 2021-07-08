package com.ujiuye.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/likeServlet")
public class LikeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        Integer count = (Integer) sc.getAttribute("count");//获取原来点赞量去(哪获取：ServletContext)
        if(count==null) {
            count=1;
        }else {
            count++;
        }
        //将新的点赞量放回原来的位置
        sc.setAttribute("count",count);
        //将新的点赞量响应给Ajak
        response.getWriter().print(count);

    }
}
