import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response){
	try{
	PrintWriter pw=response.getWriter();
	pw.println("Welcome to Java World");	
	}catch(Exception e){
	e.printStackTrace();	
	}
	}
}
