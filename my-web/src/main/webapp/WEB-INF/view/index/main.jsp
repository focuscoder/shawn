<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" >
<%@ include file="/including.jsp"%>   
<script type="text/javascript" src="js/routs/main.js"></script> 
<meta charset="utf-8">
</head>
  <body onload="gettime()">    
   	<div class="index_top">
		<span class="hh"><h1>大数据分析平台</h1></span><span class="crrentuser">当前用户:<span class="uname">admin</span></span><span class="time"></span ><span class="loginout">退出</span>
   </div>
   
	<div class="index_left">
		<nav>
		<ul>
		<li><a href="user/music.do" target="mainContainer">音乐管理</a>
			
		</li>
		<li><a href="html/two.html" target="mainContainer">详情分析</a>
	 
		</li>
		<li><a href="html/three.html" target="mainContainer">客户维护</a>
		
		</li>
		</li>
		<li><a href="user/userindex.do" target="mainContainer">用户管理</a>
		
		</li>
		</ul>
		</nav>
	</div>
		
	
	<div id="mainContainer" class="index_main">  
					<iframe width="100%" height="100%"  scrolling="no" id="iframeContainer" frameborder="no"
						border="0" marginwidth="0" marginheight="0" scrolling="no"
		 				allowtransparency="yes" name="mainContainer"
						src="login/toindex.do"> 
					</iframe>  
	</div>   
	
	
	<div class="index_bottom">
	<span>关于我们</span><span style="margin-left:10px;">邮箱：idata@shtnhgny.com </span>
							
	</div>   

</body>
</html>
    