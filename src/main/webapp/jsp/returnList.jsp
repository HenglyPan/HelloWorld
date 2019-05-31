<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>Insert title here</title>
</head>
<body>
  <h3>
    <%
     Enumeration<String> enumlist= request.getAttributeNames();
     while(enumlist.hasMoreElements()){
    	 String list= enumlist.nextElement();
    	 out.print(list+"<br>");
     }
    %>
    
    
  
  </h3>
  <h2>
        ${stringList.size()}
  </h2>
</body>
</html>