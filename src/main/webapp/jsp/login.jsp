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
    <form action="test/login03" method="get">
      <table style="width: 327px; height: 62px;">
       <tr>
         <td>用户名</td>
         <td><input type="text" name="username"></td>
       </tr>
       
        <tr>
          <td>密码</td>
          <td><input type="password" name="password" style="width: 153px; "></td>
       </tr>
       
       <tr>
        <td>登录时间</td>
        <td><input type="date" name="time"></td>
      </tr>
      
      </table>
      <input type="submit" value="登录" style="width: 164px; color: White; background-color: Blue">
    
    
    </form>
</body>
</html>