<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<link rel="stylesheet" href="../css/base.css">
<link rel="stylesheet" href="../css/index.css">
<link rel="stylesheet" href="../css/register.css"j>
<script language="javascript" src="../js/jquery-3.2.1.min.js"></script>
<script language="javascript" src="../js/button.js"></script>
</head>
<body>
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
  <p class="ptwo" style="font-size:25px">博客注册：<font color="red">${requestScope.info}</font></p>
  <div>
  <form id="register" action="register" method="post">
  <div class="register_ul">
  <div class="row_one">
  <div class="row_left">
  <span>用户名：</span>
    <input type="text" name="username">
    </div>
    <div class="row_right">
  <span>密码:</span>&nbsp;<input type="password" name="password">
  </div>
  </div>
    <div class="row_one">
  <div class="row_left">
  <span>确认密码：</span>
    <input type="password" name="repassword">
    </div>
    <div class="row_right">
  <span>昵称:</span>&nbsp;<input type="text" name="nickname">
  </div>
  </div>
    <div class="row_one">
  <div class="row_left">
  <span>密保问题：</span>
    <input type="text" name="question">
    </div>
    <div class="row_right">
  <span>答案:</span>&nbsp;<input type="text" name="answer">
  </div>
  </div>
  <div class="register_button">
     <input type="submit" value="注册">
  </div>
  </div>
  </form>
  </div>
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
         <a> <button class="button1" >博客首页</button></a>
         <br>
         <a> <button class="button1" >新博客注册</button></a>
         <br>
         <a> <button class="button1" >博客登陆</button></a>
        </div>
    </div>
    
</div>
<div id="foot">
       <p>@by sww@博客网站系统</p>
</div>
</body>
</body>
</html>