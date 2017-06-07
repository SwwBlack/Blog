<%@page import="com.util.Page"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>未登录首页</title>
<link rel="stylesheet" href="../css/base.css">
<link rel="stylesheet" href="../css/index.css">
<link rel="stylesheet" href="../css/blogMainpage.css"j>
<script language="javascript" src="../js/jquery-3.2.1.min.js"></script>
<script language="javascript" src="../js/button.js"></script>
</head>
<body>
<s:action name="pageaction" namespace="/">
  <s:param name="page" value="1"></s:param>
</s:action>
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
    <p class="pone">博客系统首页</p>
    <br>
    <br>
  <p class="ptwo" style="font-size:25px">博客显示：</p>
  <br>
  <br>
  <div class="jilu_div">
  <s:iterator value="#session.list" var="tx">
  <a href="showArticle" class="a_jilu">
  <ul class="tdjilu">
     <li style="font-size: 25px"><s:property value="#tx.Id"></s:property><span>.</span>&nbsp;<s:property value="#tx.title"/></li>
  <li style="font-size: 20px"><s:property value="#tx.date"/></li>
  </ul>
  </a>
  </s:iterator>
  </div>
  <br>
  <div>
  <s:set var="pagebeens" value="#request.pagebeens"></s:set>
  <ul class="page">
  <li  align="center" bgcolor="#5BA8DE">   
         共<s:property value="#pagebeens.allRow"/>条记录        
         共<s:property value="#pagebeens.totalPage"/>页        
         当前第<s:property value="#pagebeens.currentPage"/>页
         <br>
         <br>
         <s:if test="%{#pagebeens.currentPage == 1}">    
           第一页  上一页    
         </s:if>    
         <!-- currentPage为当前页 -->    
         <s:else>   
           <a href="pageaction?page=1">第一页</a>    
           <a href="pageaction?page=<s:property value="%{#pagebeens.currentPage-1}"/>">上一页</a>    
         </s:else>    
        
         <s:if test="%{#pagebeens.currentPage != #pagebeens.totalPage}">    
         <a href="pageaction?page=<s:property value="%{#pagebeens.currentPage+1}"/>">下一页</a>    
         <a href="pageaction?page=<s:property value="#pagebeens.totalPage"/>">最后一页</a>    
         </s:if>    
        
         <s:else>    
         下一页  最后一页    
         </s:else>    
         </li>    
        </ul> 
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
</html>