package in.sp.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class LogIn extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("i am in login serice method");
		String myEmail = (String) req.getParameter("name1");
		String myPass = (String) req.getParameter("pass1");
		
		if(myEmail.equals("fiona@gmail.com") && myPass.equals("fiona@123")) {
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
	}	
}
