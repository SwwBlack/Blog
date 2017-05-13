<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
<!-- InstanceEndEditable -->
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
<style type="text/css">
<!--
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background-color: #42413C;
	margin: 0;
	padding: 0;
	color: #000;
}
/* ~~ 元素/标签选择器 ~~ */
ul, ol, dl { /* 由于浏览器之间的差异，最佳做法是在列表中将填充和边距都设置为零。为了保持一致，您可以在此处指定所需的数值，也可以在列表包含的列表项（LI、DT 和 DD）中指定所需的数值。请记住，除非编写一个更具体的选择器，否则，在此处进行的设置将层叠到 .nav 列表。 */
	padding: 0;
	margin: 0;
}
h1, h2, h3, h4, h5, h6, p {
	margin-top: 0;	 /* 删除上边距可以解决边距会超出其包含的块的问题。剩余的下边距可以使块与后面的任何元素保持一定距离。 */
	padding-right: 15px;
	padding-left: 15px; /* 向块内的元素侧边（而不是块元素自身）添加填充可避免使用任何方框模型数学。此外，也可将具有侧边填充的嵌套块用作替代方法。 */
}
a img { /* 此选择器将删除某些浏览器中显示在图像周围的默认蓝色边框（当该图像包含在链接中时） */
	border: none;
}
/* ~~ 站点链接的样式必须保持此顺序，包括用于创建悬停效果的选择器组在内。 ~~ */
a:link {
	color: #42413C;
	text-decoration: underline; /* 除非将链接设置成极为独特的外观样式，否则最好提供下划线，以便可从视觉上快速识别 */
}
a:visited {
	color: #6E6C64;
	text-decoration: underline;
}
a:hover, a:active, a:focus { /* 此组选择器将为键盘导航者提供与鼠标使用者相同的悬停体验。 */
	text-decoration: none;
}
/* ~~ 此固定宽度容器包含所有其它块 ~~ */
.container {
	width: 960px;
	background-color: #FFFFFF;
	margin: 0 auto; /* 侧边的自动值与宽度结合使用，可以将布局居中对齐 */
}
/* ~~ 标题未指定宽度。它将扩展到布局的完整宽度。 ~~ */
header {
	background-color: #ADB96E;
}
/* ~~ 以下是此布局的列。 ~~ 

1) 填充仅放置在块元素的顶部和/或底部。这些块中的元素侧边具有填充。这样，您就可以避免使用任何“方框模型数学”。请记住，如果向块自身添加任何侧边填充或边框，这些侧边填充或边框将与您定义的宽度相加以得出 *总计* 宽度。您也可以选择删除块元素中的元素填充，并在该元素中另外放置一个没有任何宽度但具有设计所需填充的块元素。

2) 由于这些列均为浮动列，因此未对其指定边距。如果必须添加边距，请避免在浮动方向一侧放置边距（例如，将块中的右边距设置为向右浮动）。在很多情况下，可以改用填充。对于必须破例的块，应向该块元素的规则中添加“display:inline”声明，以控制某些版本的 Internet Explorer 使边距翻倍的错误。

3) 由于可以在一个文档中多次使用类（并且一个元素也可以应用多个类），因此已为这些列分配类名，而不是 ID。例如，如有必要，可以堆叠两个侧栏块。您可以根据个人偏好将这些名称轻松改为 ID，前提是仅对每个文档使用一次。

4) 如果您更喜欢在左侧（而不是右侧）进行导航，只需使这些列向相反方向浮动（全部向左，而非全部向右），它们将按相反顺序显示。您无需在 HTML 源文件中移动块。

*/
.sidebar1 {
	float: right;
	width: 180px;
	background-color: #EADCAE;
	padding-bottom: 10px;
}
.content {
	padding: 10px 0;
	width: 780px;
	float: right;
}

/* ~~ 此分组的选择器为 .content 区域中的列表提供了空间 ~~ */
.content ul, .content ol {
	padding: 0 15px 15px 40px; /* 此填充反映上述标题和段落规则中的右填充。填充放置于下方可用于间隔列表中其它元素，置于左侧可用于创建缩进。您可以根据需要进行调整。 */
}

/* ~~ 导航列表样式（如果选择使用预先创建的 Spry 等弹出菜单，则可以删除此样式） ~~ */
ul.nav {
	list-style: none; /* 这将删除列表标记 */
	border-top: 1px solid #666; /* 这将为链接创建上边框 – 使用下边框将所有其它项放置在 LI 中 */
	margin-bottom: 15px; /* 这将在下面内容的导航之间创建间距 */
}
ul.nav li {
	border-bottom: 1px solid #666; /* 这将创建按钮间隔 */
}
ul.nav a, ul.nav a:visited { /* 对这些选择器进行分组可确保链接即使在访问之后也能保持其按钮外观 */
	padding: 5px 5px 5px 15px;
	display: block; /* 这将为链接赋予块属性，使其填满包含它的整个 LI。这样，整个区域都可以响应鼠标单击操作。 */
	width: 160px;  /*此宽度使整个按钮在 IE6 中可单击。如果您不需要支持 IE6，可以删除它。请用侧栏容器的宽度减去此链接的填充来计算正确的宽度。 */
	text-decoration: none;
	background-color: #C6D580;
}
ul.nav a:hover, ul.nav a:active, ul.nav a:focus { /* 这将更改鼠标和键盘导航的背景和文本颜色 */
	background-color: #ADB96E;
	color: #FFF;
}

/* ~~ 脚注 ~~ */
footer {
	padding: 10px 0;
	background-color: #CCC49F;
	position: relative;/* 这可以使 IE6 hasLayout 以正确方式进行清除 */
	clear: both; /* 此清除属性强制 .container 了解列的结束位置以及包含列的位置 */
}

/*HTML5 支持 - 将新 HTML5 标签设置为 display:block，以使浏览器知道如何正确呈现标签。 */
header, section, footer, aside, article, figure {
	display: block;
}
-->
</style>
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<!-- InstanceParam name="OptionalRegion1" type="boolean" value="true" -->
</head>

<body>
<div class="container">
  <header>
    <table width="961" border="0" background="${pageContext.request.contextPath }/image/3.jpg">
  <tbody>
    <tr>
      <td width="511" height="42" style="color: #F0F0F0">我是${sessionScope.nickname}</td>
      <td width="434">&nbsp;</td>
    </tr>
    <tr>
      <td height="74"><span style="color: #E8E8E8"> 我喜欢写博客</span></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="54"><ul class="nav">
      </ul></td>
      <td><a href="Main.jsp"><input type="button" value="博客首页"></a>&nbsp;<a href="usermain.jsp"><input type="button" value="用户首页"></a>&nbsp;<a href="personlity.jsp"><input type="button" value="个性化设置"></a>&nbsp;<a href="writeArticle.jsp"><input type="button" value="写日志"></a>&nbsp;&nbsp;<a href="album.jsp"><input type="button" value="相册"></a></td>
    </tr>
  </tbody>
</table>

  </header>
  <div class="sidebar1">
    <ul class="nav">
        <li></li>
        <br>
      <input type="text" name="searchAction" size="15">&nbsp;search
        <br>
        <li> 首页导航</li>
        
        <li><a href="usermain.jsp">用户首页</a></li>
        
        <li><a href="Main.jsp">博客首页</a></li>
        
        <li><a href="personlity.jsp">个性化设置</a></li>
        
        <li><a href="writeArticle.jsp">写日志</a></li>
        <li><a href="album.jsp">相册</a></li>
    </ul>
  <!-- end .sidebar1 --></div>
  <!-- InstanceBeginEditable name="EditRegion3" -->
  <article class="content">
    <h1>上传图片</h1>
    <section>
    <form action="photoUpload" method="post" enctype="multipart/form-data">
      <h2>选择要上传的图片：<s:file name="myfile" value="浏览"></s:file>
        <input type="submit" value="上传"/>
      </h2>
    </form>
    <h2>显示图片</h2>
    <s:iterator value="#request.photoList" var="list">
    <div align="left">
       <img alt="" src="${pageContext.request.contextPath }/user/photo/${sessionScope.username}/${list}" width="150" height="150">
    </div>
    </s:iterator>
    </section>
    <!-- end .content --></article>
    <!-- InstanceEndEditable -->
  <footer>
    <p align="center">@by SWW@博客网站系统</p>
  </footer>
  <!-- end .container --></div>
</body>
<!-- InstanceEnd -->
</html>