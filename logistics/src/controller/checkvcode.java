package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class checkvcode extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String vcodeString=request.getParameter("vcode");
		HttpSession session=request.getSession();
		String savevcode =(String)session.getAttribute("verifyCode");
		String ret;
		if(vcodeString.equalsIgnoreCase(savevcode)){
			ret="0";		
		}
		else{
			
			ret="1";
		}
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print(ret);
		out.flush();
		out.close();
	}

}
