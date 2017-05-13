<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="ck" uri="http://ckeditor.com"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/JavaScript" src="/ckeditor/ckeditor.js"></script>
</head>
<body>
<div>
<div id="left" style="width: 60%; height: 80%; float: left; font-style: italic; font-weight: bolder; text-align: right; font-size:18px;background:#C6C6C6" >
  <form action="writeArticle" method="post">
   <h2 align="left">标题：<input type="text" name="title"></h2>
   <h2 align="left">内容：</h2>
   <p align="left"><textarea rows="15" cols="60" name="content"></textarea></p>
   <h2 align="left"><input type="submit" value="提交文章"></h2>
   <hr>
  </form>
  </div>
<div id="right" style="width:40%;height:80%;float:right;color:#000000" >
  <h3 align="center"><input type="text">serach</h3>
  <table width="427" height="299" border="0" align="center">
  <tbody>
    <tr>
      <td width="291" height="64" align="center">页面导航</td>
    </tr>
    <tr>
      <td height="72" align="center"><a href="usermain.jsp">用户首页</a></td>
    </tr>
    <tr>
      <td height="72" align="center"><a href="Main.jsp">博客首页</a></td>
    </tr>
    <tr>
      <td height="81" align="center"><a href="personlity.jsp">个性化设置</a></td>
    </tr>
    <tr>
      <td height="72" align="center"><a href="writeArticle.jsp">写日志</a></td>
    </tr>
     <tr>
      <td height="72" align="center"><a href="album.jsp">相册</a></td>
    </tr>
     <tr>
      <td height="72" align="center"><a href="login.jsp">退出登录</a></td>
    </tr>
  </tbody>
</table>
</div>
<h3 align="justify">&nbsp;</h3>
  <h3 align="justify">&nbsp;</h3>
  <h3 align="justify">&nbsp;</h3>
  <h3 align="justify">&nbsp;</h3>
  <h3 align="center">@by sww@博客网站系统</h3>
</body>
</html>