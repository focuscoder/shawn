<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />
<meta name="apple-mobile-web-app-capable" content="yes" /> 
<meta name="apple-mobile-web-app-status-bar-style" content="black" /> 
<meta name="format-detection" content="telephone=no" /> -->
 
 <?xml version="1.0" encoding="UTF-8"?>  
<!-- <!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">  
 -->  
<title>中软高科登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="/including.jsp"%>    
<script type="text/javascript" src="<%=basePath%>js/routs/user.js"></script>

<style type="text/css">

	.sureadd{width:70px;height:35px;background: rgb(237, 231, 191);cursor:pointer;display: inline-block;margin-left:220px;line-height: 35px;text-align: center;}
.cancel{width:70px;height:35px;background: rgb(237, 231, 191);cursor:pointer;display: inline-block;line-height: 35px;text-align: center;}

.addobj{ width:600px;height:400px;
		 background-color: rgb(85, 221, 159);
		 position:absolute;  
		 padding:0px 0px; 
		 left:200px;  
		 top:100px;  
		 z-index:5; 
		
}
input {
    border: 1px solid #B4B4B4;
    border-radius: 5px;
    width:250px;
    height: 30px;
    line-height: 30px;
    font-size:12px;
    padding: 0px 10px;
    box-shadow:inset 2px 2px 5px #EAEAEA;
  }
/* .addobj input{width:250px;height:30px;} */
.addobj .formspan{width:250px;height:30px;display:inline;margin-left:150px;}
.toolsdiv{
		 width:100px;
		 height:250px;
		 background-color: purple;
		 position:absolute;  
		 padding:0px 0px;  
		 left:100px;  
		 top:70px;  
		 z-index:5;
		 opacity:0.5;
}
.toolsdivhide{opacity:0;}
.toolsd:HOVER{opacity:0.5;}
.toolsd:hover{cursor:pointer;} 
.toolsd ul li:hover{background:green;}
.toolsd ul {list-style: none;}
.addobj .addtitle{margin-left:10px;line-height:32px;color:cornsilk;}
.addobj b{float: right;cursor:pointer;  float: right;font-size: 
		  xx-large;margin-right: 10px;margin-top: -5px;}
		  
		  
	.page {height: 30px;
  line-height: 30px;
  margin-left: 85px;
  color: gray;}
  
.page span input{  color: currentColor;
  line-height:30px;
  width:50px; 
  border: 1px solid gray;}
  
  .page span{margin-left:5px;cursor:pointer;}
</style>   
  </head>    
    
<body>    
 
  	
	<div style="width:100%;height:20px;background:yellow">
	<button class="add">添加</button>
	</div>
	
	<div class="mod">
		<div class="mod_head">
			<h3 class="tools">概要信息</h3>
		</div>
		<div class="mod_body">
			<table class="data-load" align="center" valign="middle">
				<thead>
					<tr>
					<th>编号</th>
					<th>名称</th>
					<th>产地</th>
					<th>价格</th>
					<th>售后</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
			<div id="page" class="page">
				<select class="pagenum" name="pagenum">
				 <option>2</option>
				 <option>3</option>
				 <option>4</option>
				</select>
				<span class="firstpage">首页</span><span class="prevpage">上页</span><span>第<input class="pageindex" value="1" name="pageindex"/>页</span><span class="nextpage">下页</span><span>共<span class="totalpage" name="totalpage"></span>页</span><span class="lastpage">末页</span><span class="loadpage">加载</sapn>
			</div>
		</div>
	
	</div>
 
 
 	<div class="addobj" style="display: none;">
 		<div style="height:35px;width:600px;background: rgb(182, 110, 202);"><span class="addtitle">添加</span><b>x</b></div><br><br>
 		<span class="formspan">编号:<input type="text" name="user_id" class="userid"/></span><br><br>
 		<span class="formspan">名称:<input type="text" name="user_name" class="username"/></span><br><br>
 		<span class="formspan">产地:<input type="text" name="duty" class="duty"/></span><br><br>
 		<span class="formspan">价格:<input type="text" name="partment" class="partment"/></span><br><br>
 		<span class="formspan">售后:<input type="text" name="create_time" class="createtime"/></span><br><br><br>
 		<span class="sureadd">确定</span> <span class="cancel">取消</span>
 	</div>
 	<div class="toolsd">
 		<ul style="list-style: none;cursor:pointer;">
 		<li>gffrth</li>
 		<li>gffrth</li>
 		<li class="tiao">tanba</li>
 		<li>gffrth</li>
 		<li>gffrth</li>
 		</ul>
 	</div>
 <script type="text/javascript">    
 	
 </script>
</body>
</html>
