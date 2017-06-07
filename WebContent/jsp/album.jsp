<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>相册界面</title>
<link rel="stylesheet" href="../css/album.css">
<link rel="stylesheet" href="../css/afterloginbase.css">
<script language="javascript" src="../js/jquery-3.2.1.min.js"></script>
<script language="javascript" src="../js/usermain_button.js"></script>
<script language="javascript" src="../js/bigPhoto.js"></script>
</head>

<body>
<div id="photobigshow">
     <img alt="" src="" id="bigimage">
</div>
<div class="container">
  <header>
    <table width="1200px" border="0" background="${pageContext.request.contextPath }/image/3.jpg">
  <tbody>
    <tr>
      <td width="511px" height="42" style="color: #F0F0F0">我是${sessionScope.nickname}</td>
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
    <div>
    <p style="font-size: 30px ;text-align:center">图片上传</p>
    <form action="photoUpload" method="post" enctype="multipart/form-data">
        <span>选择要上传的图片：</span><s:file name="myfile" value="浏览" size="200px"></s:file>
        <input type="submit" value="上传"/>  
    </form>
    </div>
    <!-- 图片显示区域 -->
    <div>
       <p style="font-size: 30px">显示图片</p>
       <s:iterator value="#request.photoList" var="list">
    <div class="photo">
      <a onclick="bigPhoto(this)" href="javascript:void(0);"> <img alt="" src="${pageContext.request.contextPath }/user/photo/${sessionScope.username}/${list}" ></a>
       &nbsp;
    </div>
    </s:iterator>
    </div>
</article>
  <footer>
    <p align="center">@by SWW@博客网站系统</p>
  </footer>
  <!-- end .container --></div>
</body>

</html>