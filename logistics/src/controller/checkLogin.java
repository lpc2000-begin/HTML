package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.checkcode;

public class checkLogin extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userNameString=request.getParameter("username");//userName
		String passwordString=request.getParameter("password");
		String vcodeString=request.getParameter("vcode");
		HttpSession session=request.getSession();
		String savevcode =(String)session.getAttribute("verifyCode");//verifyCode
		int ret=0;
		String retString = "";
		if(vcodeString.equalsIgnoreCase(savevcode)){
			ret=2;
			checkcode ck=new checkcode();
			ret=ck.check(userNameString, passwordString);
		}
			retString=Integer.toString(ret);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print(retString);
		out.flush();
		out.close();
	}

}
