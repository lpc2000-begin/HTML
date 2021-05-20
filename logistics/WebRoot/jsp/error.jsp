<%@ page language="java"  pageEncoding="utf-8"%>
<%-- <%@ page import="java.text.SimpleDateFormat"   %>
<%@ page import="java.util.Date"    %> --%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP </title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>

  <body>
  <%

		String s="";
        int ret=(Integer)request.getAttribute("errorCode");
        if(ret==1){
            s="用户名不正确";
        }
        else if(ret==2){
            s="密码不正确";
        }
        else if(ret==0){
            s="验证码不正确";
        }
        else if(ret==3){
        
        s="登录成功";
        response.sendRedirect("../pages/book.html");
        }
        
        
		

		
	%>
	<p style="color:red;font-size:16px;">
		<%=s%>
	</p>	
  </body>
</html>
