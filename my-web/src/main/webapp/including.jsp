<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=UTF-8"%>

<%-- <%@ taglib prefix="fmt" uri=http://java.sun.com/jsp/jstl/fmt %> --%>
<%-- <%@ taglib prefix="fn" uri=http://java.sun.com/jsp/jstl/functions %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%-- <%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>
<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld" %> --%>  
<%     
String baseUrl = request.getContextPath();     
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+baseUrl+"/";
%>
<c:set var="rootPath" value="<%=baseUrl%>"></c:set> 
<c:set var="basePath" value="<%=basePath%>"></c:set> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<base href="<%=basePath%>">
 <!--加载共通CSS--> 
<%-- <link href="<%=basePath%>/static/css/960/fluid/grid.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]><link href="<%=basePath%>/static/css/960/fluid/ie6.css" rel="stylesheet" type="text/css" /><![endif]-->
<!--[if IE 7]><link href="<%=basePath%>/static/css/960/fluid/ie.css"  rel="stylesheet" type="text/css" /><![endif]-->
<link href="<%=basePath%>/static/css/btns/css3btn.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>/static/css/btns/sexybuttons.css" rel="stylesheet" type="text/css" />

<link id="easyuiTheme" rel="stylesheet" type="text/css" href="<%=basePath%>/static/js/easyui/themes/default/easyui.css" id="swicth-style"> --%>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/common.css">

<!--加载  js-->
<script type="text/javascript" src="<%=basePath%>js/public/common.js"></script>
<script type="text/javascript" src="<%=basePath%>js/public/ejs.js"></script>
<script type="text/javascript" src="<%=basePath%>js/public/jquery-1.8.0.min.js"></script>
