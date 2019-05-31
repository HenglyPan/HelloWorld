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
	  var json_str='{"username":"heng","password":"123445","time":"1919-01-22"}';
	  $.ajax({
		  url:"json_str_user",
		  data:json_str,
		  type:"POST",
		  contentType:"application/json",
	      dataType:"json",
		  success:function(data){
			  console.info(data)
			  
		  }
		  
		  
	  })
	  
	  
	  
  })
 


</script>
</head>
<body>

</body>
</html>