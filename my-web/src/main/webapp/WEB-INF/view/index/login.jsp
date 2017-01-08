<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%     
String baseUrl = request.getContextPath();     
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+baseUrl+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>高科登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%-- <%@ include file="/including.jsp"%>  --%>

<style>
body{  background: rgb(51, 60, 107);}
body div{
  width: 400px;
  background: darkgrey;
  margin-left: 500px;
  height: 250px;
  margin-top: 170px;
}

div input{
  width: 230px;
  border-radius: 6px;
  height: 28px;
}
div form {margin-left: 55px;padding-top: 30px;}

</style>
  </head>
  
  <body>
  <div>
    <form action="${basePath}tomain.do" id="form" method="post">
    昵称:<input  type="text" name="userPname"><br><br><br>
    密码:<input  type="password" name="userPwd"><br><br><br> 
    <input type="submit" value="登录" style="width:80px;margin-left: 105px">
    </form>  
   </div> 
 <script type="text/javascript">    
  	
  </script>
</body>
</html>
