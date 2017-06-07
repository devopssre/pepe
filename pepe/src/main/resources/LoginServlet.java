import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response){
	try{
	String uname=request.getParameter("uname");
	RequestDispatcher rd=request.getRequestDispatcher("fs");
	rd.forward(request,response);
	}catch(Exception e){
	e.printStackTrace();
	}

	}

}
