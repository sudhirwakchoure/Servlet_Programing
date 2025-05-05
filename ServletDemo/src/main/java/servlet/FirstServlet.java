package servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet {
	
	private ServletConfig servletConfig;

	//life cycle method

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		this.servletConfig =arg0;
	  System.out.println("servlet initilization");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {

		System.out.println("Servlet services request");
	}
	

	@Override
	public void destroy() {

		System.out.println("Servlet destory request");	
	}

	
	//non life cycle method
	@Override
	public ServletConfig getServletConfig() {
		
		return this.servletConfig;
	}

	@Override
	public String getServletInfo() {
		
		return "this servlet cratedby sudhir";
	}

}
