<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jquery.min.js"></script>
 <script type="text/javascript">
  $(function(){
	 
	 $.get(
		 "json_list.do",
		 function(data){
			 console.info(data)
			 $("tbody").empty();
			$.each(data,function(index,item){
				$("<tr><td>"+item.username+"</td><td>"+item.password+"</td></tr>").appendTo($("tbody"))
				
			}) 
			 
		 },
		 "json"
	 
	 
	 )
	 
	 
	 
  })
  
 
 </script>
 
</head>
<body>
  
   <table>
      <thead>
        <tr>
			<th>用户名</th>
			<th>密码</th>
			
		</tr>
     </thead>
     <tbody>
     
     
     </tbody>
   
   </table>
</body>
</html>