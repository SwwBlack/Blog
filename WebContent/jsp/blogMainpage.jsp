<%@page import="com.util.Page"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
      <td><a href="blogMainpage.jsp"><input type="button" value="博客首页" >
      </a>&nbsp;   <a href="register.jsp">
      <input type="button" value="新博客注册">
      </a>  &nbsp;<a href="login.jsp">
      <input type="button" value="博客登陆"></a></td>
    </tr>
  </tbody>
</table>
<!-- InstanceEndRepeatEntry --><!-- InstanceEndRepeat -->
<!-- InstanceBeginEditable name="EditRegion3" -->
<div id="contains">
  <div id="left" style="width: 60%; height: 80%; float: left; font-style: italic; font-weight: bolder; text-align: right; font-size:18px;background:#C6C6C6" >
  <h2 align="left">博客系统首页</h2>
  <h4 align="left">博客显示：</h4>
  <table>
  <s:iterator value="#session.list" var="tx">
  <tr>
  <td align="left"><s:property value="#tx.Id"></s:property><td>
  <td align="left"><s:property value="#tx.title"/></td>
  <td align="right"><s:property value="#tx.date"/></td>
  </tr>
  </s:iterator>
  <s:set var="pagebeens" value="#request.pagebeens"></s:set>
  <tr>
  <td colspan="6" align="center" bgcolor="#5BA8DE">   
         共<s:property value="#pagebeens.allRow"/>条记录        
         共<s:property value="#pagebeens.totalPage"/>页        
         当前第<s:property value="#pagebeens.currentPage"/>页<br>    
        
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
         </td>    
        </tr> 
  </table>
 
  </div>
  <div id="right" style="width:40%;height:80%;float:right;color:#000000" >
    <h3 align="center"><input type="text">serach</h3>
    <table width="427" height="210" border="0" align="center">
  <tbody>
    <tr>
      <td width="291" align="center">页面导航</td>
    </tr>
    <tr>
      <td align="center"><a href="blogMainpage.jsp">博客首页</a></td>
    </tr>
    <tr>
      <td align="center"><a href="register.jsp">新博客注册</a></td>
    </tr>
    <tr>
      <td height="66" align="center"><a href="login.jsp">博客登陆</a></td>
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