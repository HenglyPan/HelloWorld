<%@page import="org.apache.log4j.Logger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@page isErrorPage="true" %>
<%@taglib uri="http://www.springframework.org/tags/form"   prefix="form"%>
<!DOCTYPE html>
<%  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">错误页面</h1>

 <%
  String mess= exception.getMessage();
  out.println(mess);
  Logger logger=Logger.getLogger(mess);
  
  
  
 %>
 
   <form:form commandName="user">
      <!-- path 是指被校验的属性名 -->
      <form:errors path="username"></form:errors>
      <form:errors path="password"></form:errors>
   </form:form>
</body>
</html>