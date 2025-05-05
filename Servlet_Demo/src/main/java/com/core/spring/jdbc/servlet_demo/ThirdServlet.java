package com.core.spring.jdbc.servlet_demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Third Servlet call by using doGet method this " +
                "servlet implementation by extending the HttpServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg = req.getParameter("msg");
        System.out.println("message is  : " + msg);

        Date date = new Date();
        resp.setContentType("text/html");

        // Hello
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + msg + "</h1>");
        out.println("<h1> Form is  successfully submitted </h1>");
        out.println("<span style='color:red'>" + date + "</span>");
        out.println("</body></html>");
        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
