<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户首页</title>
<link rel="stylesheet" href="../css/usermain.css">
<link rel="stylesheet" href="../css/afterloginbase.css">
<script language="javascript" src="../js/jquery-3.2.1.min.js"></script>
<script language="javascript" src="../js/usermain_button.js"></script>
</head>

<body>
<s:action name="pageaction2" namespace="/">
  <s:param name="page" value="1"></s:param>
</s:action>
<div class="container">
  <header>
    <table width="1200px" border="0" background="${pageContext.request.contextPath }/image/3.jpg">
  <tbody>
    <tr>
      <td width="511px" height="42" style="color:#F0F0F0">我是${sessionScope.nickname}</td>
      <td width="689px">&nbsp;</td>
    </tr>
    <tr>
      <td height="74"><span style="color: #E8E8E8"> 我喜欢写博客</span></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="54"></td>
      <td class="htd"><a href="Main.jsp"><input type="button" value="博客首页" class="button1"></a>&nbsp;<a href="usermain.jsp"><input type="button" value="用户首页" class="button1"></a>&nbsp;<a href="personlity.jsp"><input type="button" value="个性化设置" class="button1"></a>&nbsp;<a href="writeArticle.jsp"><input type="button" value="写日志" class="button1"></a>&nbsp;&nbsp;<a href="album.jsp"><input type="button" value="相册" class="button1"></a></td>
    </tr>
  </tbody>
</table>
  </header>
  <div class="sidebar1">
    <ul class="nav">
    <br>
    <br>
        <li>
      <input type="text" name="searchAction" size="15">&nbsp;&nbsp;<button>search</button>
        </li>
        <li> 首页导航</li>
        
        <li><a href="usermain.jsp">用户首页</a></li>
        
        <li><a href="Main.jsp">博客首页</a></li>
        
        <li><a href="personlity.jsp">个性化设置</a></li>
        
        <li><a href="writeArticle.jsp">写日志</a></li>
        <li><a href="album.jsp">相册</a></li>
    </ul>
 </div>
  <article class="content">
    <p>用户首页</p>
    <section>
      <h4 align="left">用户博客显示：</h4>
  <s:iterator value="#session.ulist" var="tx">
  <a href="showArticle?aid=${tx.getId() }">
    <h3><s:property value="#tx.Id"/>
    <s:property value="#tx.title"/></h3></a>
    <h4 align="right">发表人：<s:property value="#session.username"/>|发表时间：<s:property value="#tx.date"/>|评论数(<s:property value="#tx.critiquecount"/>)|点击(<s:property value="#tx.hasread"/>)</h4>
  </s:iterator>
  <s:set var="pagebeens" value="#request.upagebeens"></s:set>
  <div class="pagediv">  
         共<s:property value="#pagebeens.allRow"/>条记录        
         共<s:property value="#pagebeens.totalPage"/>页        
         当前第<s:property value="#pagebeens.currentPage"/>页<br>    
        
         <s:if test="%{#pagebeens.currentPage == 1}">    
           第一页  上一页    
         </s:if>    
         <!-- currentPage为当前页 -->    
         <s:else>    
           <a href="pageaction2?page=1">第一页</a>    
           <a href="pageaction2?page=<s:property value="%{#pagebeens.currentPage-1}"/>">上一页</a>    
         </s:else>    
        
         <s:if test="%{#pagebeens.currentPage != #pagebeens.totalPage}">    
         <a href="pageaction2?page=<s:property value="%{#pagebeens.currentPage+1}"/>">下一页</a>    
         <a href="pageaction2?page=<s:property value="#pagebeens.totalPage"/>">最后一页</a>    
         </s:if>    
        
         <s:else>    
         下一页  最后一页    
         </s:else>   
  </div>
    </section>
</article>
  <footer>
    <p align="center">@by SWW@博客网站系统</p>
  </footer>
  <!-- end .container --></div>
</body>
</html>