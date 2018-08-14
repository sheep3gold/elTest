package com.yx.servlet;

import com.yx.dao.impl.userImpl;
import com.yx.dao.user;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 16:22 2018/8/14
 * @ Description：${description}
 * @ Modified By：
 */
public class elServlet extends HttpServlet {
    user u=new userImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String i="test";
        request.setAttribute("i",i);
        String title=null;

        title=u.getName();

        List<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add(title);
        request.setAttribute("list",list);

        request.getRequestDispatcher("/eltest.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
