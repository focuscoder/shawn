<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>高科登录</title>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> -->
<meta charset="utf-8">
<%@ include file="/including.jsp"%>    

<style>
body{  background:appworkspace;}
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

      <audio id="music" src="../../static/xuelian.mp3" loop="loop" autoplay oncanplay="playtime()" ontimeupdate="updatetime()" controls="controls"></audio><br>
      <button id="btn" onclick="playmusic()">播放</button><br>
      小<input id="voice" type="range" onchange="chagevoice()" min="0" max="100"/>大
   <progress id="pro" value="0" max="100" onchange="kuaijin()"></progress><span id="time"></span>
 <script type="text/javascript">   
  	var music = document.querySelector("#music");
  	var toplay = document.querySelector("#btn");
  	var voice = document.querySelector("#voice");
  	var progres = document.querySelector("#pro");
  	var times = document.querySelector("#time");
  	var time;
  	var playtime = function(){
  		
  		time = parseInt(music.seekable.end(0));
  		progres.max = time;
  		
  		var min = 	parseInt(time/60);   
  		var s = time - min*60;
  		times.innerHTML = min +":"+ s;  
  	}
  	
  	var playmusic = function(){
  		if(music.paused){
  			music.play();
  			toplay.innerHTML = "暂停";
  		}else{
  			music.pause();
  			toplay.innerHTML = "播放";
  		}
  		
  	}
  	
  	var chagevoice = function(){
  		music.volume =  voice.value/100;  
  	}
  	
  	var updatetime = function(){
  		
  		var cutime = parseInt(music.currentTime);
  		var lasttime = time - cutime;
  		progres.value = cutime;
  		
  		var min = 	parseInt(lasttime/60);  
  		var s = lasttime - min*60;
  		times.innerHTML = min +":"+ s;  
  	}
  </script>
</body>
</html>
