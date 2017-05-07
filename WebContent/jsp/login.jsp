<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- InstanceBeginRepeat name="RepeatRegion1" --><!-- InstanceBeginRepeatEntry -->
<table width="100%" border="0" background="${pageContext.request.contextPath }/image/3.jpg" >
  <tbody>
    <tr>
      <td width="30%" bgcolor="#000000" style="font-style: normal; font-weight: bold; color: #EFEFEF;"> 博客网站系统</td>
      <td width="41%">&nbsp;</td>
      <td width="29%">&nbsp;</td>
    </tr>
    <tr>
      <td height="113">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="25">&nbsp;</td>
      <td>&nbsp;</td>
      <td><a href="mainpage.html"><input type="button" value="博客首页" >
      </a>&nbsp;   <a href="register.html">
      <input type="button" value="新博客注册">
      </a>  &nbsp;<a href="login.html">
      <input type="button" value="博客登陆"></a></td>
    </tr>
  </tbody>
</table>
<!-- InstanceEndRepeatEntry --><!-- InstanceEndRepeat -->
<!-- InstanceBeginEditable name="EditRegion3" -->
<div id="contains">
  <div id="left" style="width: 60%; height: 80%; float: left; font-style: italic; font-weight: bolder; text-align: right; font-size:18px;background:#C6C6C6" >
  <h2 align="left">博客登陆</h2>
  <p align="center"><font color="red">${requestScope.info}</font></p>
  <form action="login" method="post">
    <h2 align="left">用户名：<input type="text" name="username"></h2>
    <h2 align="left"> 密 码：
      <input type="password" name="password"></h2>
  <h4 align="center">
    <input type="submit" value="登陆">
  </h4>
  </form>
  </div>
  <div id="right" style="width:40%;height:80%;float:right;color:#000000" >
    <h3 align="center"><input type="text">search</h3>
    <table width="427" height="210" border="0" align="center">
  <tbody>
    <tr>
      <td width="291" align="center">页面导航</td>
    </tr>
    <tr>
      <td align="center">博客首页</td>
    </tr>
    <tr>
      <td align="center">新博客注册</td>
    </tr>
    <tr>
      <td height="66" align="center">博客登陆</td>
    </tr>
  </tbody>
</table>
  </div>
  <h3 align="justify">&nbsp;</h3>
  <h3 align="justify">&nbsp;</h3>
  <h3 align="justify">&nbsp;</h3>
  <h3 align="justify">&nbsp;</h3>
  <h3 align="center">@by sww@博客网站系统</h3>
</div>
<!-- InstanceEndEditable -->
</body>
</html>