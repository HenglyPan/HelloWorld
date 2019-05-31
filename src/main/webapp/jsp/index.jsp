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
 <h1 align="center">一个人的江湖一个人去闯</h1>
 <h1>获取到的request的值为${user}</h1>
 <h2>map的值为${username}</h2>
 <h2>modelMap的值为${xingming}</h2>
 
 <h2>sessionAttribute的值 ${sessionScope.user}</h2>
 <h1>上传文件：${mes}</h1>
</body>
</html>