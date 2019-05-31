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
    <form action="">
       <table style="width: 282px; color: Blue" border="4px solid ">
          <tr>
          <td><b>姓名</b></td><b>
          </b><td><b><input type="text" name="user"></b></td><b>
          </b></tr><b>
          
          </b><tr><b>
          </b><td><b>用户名</b></td><b>
          </b><td><b><input type="text" name="username"></b></td><b>
          </b></tr><b>
          
          </b><tr><b>
          </b><td><b>密码</b></td><b>
          </b><td><b><input type="password" name="password" style="width: 152px; "></b></td><b>
          </b></tr><b>
          
          </b><tr><b>
          </b><td><b>性别</b><b></b></td><b>
          </b><td style="width: 148px; "><b>
          </b><b><input type="radio" name="man" checked="checked"></b><b>男
          </b><b><input type="radio" name="women"></b><b>女
          </b></td><b>
          </b></tr><b>
          
          </b><tr><b>
          </b><td><b>年龄</b></td><b>
          </b><td><b><input type="number" name="age"></b></td><b>
          </b></tr><b>
          </b><tr><b>
          </b><td colspan="2"><b><input type="submit" value="注册" style="width: 211px; color: Yellow; background-color: Blue; height: 39px"></b></td><b>
         </b></tr><b>
       </b></table><b>
    
    
    </b></form><b>
    
</b></body><b>
</b></html>