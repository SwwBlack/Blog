<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>博客网站登录页</title>
    <link rel="stylesheet" href="../css/base.css">
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/login.css"> 
    <script language="JavaScript" src="../js/jquery-3.2.1.min.js"></script>
    <script language="JavaScript" src="../js/button.js"></script>
</head>
<body>
<div>
<div>
<table id="table1">
    <tr class="trone">
        <td class="textone"> 博客网站系统</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
    </tr>
    <tr class="trone">
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
    </tr>
    <tr class="trone">
        <td >&nbsp;</td>
        <td>
            <div align="right"><a href="blogMainpage.jsp"><input type="button" value="博客首页" class="button">
        </a>&nbsp;   <a href="register.jsp">
            <input type="button" value="新博客注册" class="button">
        </a>  &nbsp;<a href="login.jsp">
                <input type="button" value="博客登陆" class="button">
                </a>
            </div>
        </td>
    </tr>
</table>
</div>
<div class="contains">
    <div class="left">
        <br>
        <p align="center" class="info">博客登陆</p>
        <br>
        <br>
        <p class="info" align="center"><font color="red">${requestScope.info}</font></p>
        <form action="login" method="post">
            <input type="text" name="username" placeholder="用户名">
            <input type="password" name="password" placeholder="密码">
            <input type="submit" value="登陆">
        </form>
    </div>
    <div class="right">
        <div>
            <input type="text" name="search_text">
            <input type="button" id="search_button" value="search">
        </div>
        <div id="divtable">
        <br>
        <br>
          <p class="textone" style="font-size:36px">页面导航</p>
          <br>
          <br>
         <a href="blogMainpage.jsp"> <button class="button1" >博客首页</button></a>
         <br>
         <a href="register.jsp"> <button class="button1" >新博客注册</button></a>
         <br>
         <a href="login.jsp"> <button class="button1" >博客登陆</button></a>
        </div>
    </div>
    
</div>
<div id="foot">
       <p>@by sww@博客网站系统</p>
</div>
</div>
</body>
</html>