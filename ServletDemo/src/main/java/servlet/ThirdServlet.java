package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	
	


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing request by therd servlet");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String  msg= req.getParameter("msg");
		
		System.out.println("Processing request by therd servlet by using post method");
		
		System.out.println("Message you are enter is" + msg);
		
		resp.setContentType("text/html");
		
		 PrintWriter out = resp.getWriter();
		 out.println("<h1> Form submited succsefully </h1>");
		 
		out.println("<h2> The give  msg is  :" + msg +"</h2>");
		 
	}
	

}
