package com.core.spring.jdbc.servlet_demo;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/first")
public class FirstServlet implements Servlet {

    private ServletConfig servletConfig;

    /* Life Cycle Method */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    System.out.println("FirstServlet init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The  First servlet services is called ");
    }


    @Override
    public void destroy() {
     System.out.println("FirstServlet destroy");
    }

   /* Non-Life Cycle Method */

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }


    @Override
    public String getServletInfo() {
        return " this is the first servlet generate  by the implementing the servlet ";
    }
}
