<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="contains">
  <div id="left" style="width: 60%; height: 80%; float: left; font-style: italic; font-weight: bolder; text-align: right; font-size:18px;background:#C6C6C6" >
  <h2 align="left">新博客注册  </h2>
  <p align="center"><font color="red">${requestScope.info}</font></p>
  <form id="register" action="register" method="post">
  <p align="left">用户名：
       <input name="username" type="text" autocomplete="off">
      </p>
    <p align="left">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：
      <input type="password" name="password">
      </p>
    <p align="left">确认密码:
      <input type="password" name="repassword">
      </p>
    <p align="left">昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：
      <input type="text" name="nickname">
      </p>
    <p align="left">密保问题：
      <input type="text" name="question">
      </p>
    <p align="left">密保答案：
      <input type="text" name="answer">
    </p>
    <h4 align="center"><input type="submit" value="注册"></h4>
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
      <td align="center"><a href="blogMainpage.jsp">博客首页</a></td>
    </tr>
    <tr>
      <td height="59" align="center"><a href="register.jsp">新博客注册</a></td>
    </tr>
    <tr>
      <td height="62" align="center"><a href="login.jsp">博客登陆</a></td>
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
</body>
</html>