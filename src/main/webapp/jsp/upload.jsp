<%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%><%@ page
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>Insert title here</title>
</head>
<body>
	<form action="upload.do" method="post" enctype="multipart/form-data"
		style="height: 182px;">
		<p align="center">
			<b>上传文件 </b>
		</p><br>
		<input type="file" name="myFile"
			style="color: #00FF80; font-size: 18px; font-style: italic">
		<br> 
		<!--<input type="file" name="myFile"
			style="color: #00FF80; font-size: 18px; font-style: italic"><br>
		 <input type="file" name="myFile"
			style="color: #00FF80; font-size: 18px; font-style: italic"><br>-->
		<input type="submit" value="上传文件"
			style="color: White; background-color: Blue; height: 48px; width: 195px"> 
		<p></p>
	</form>
</body>
</html>