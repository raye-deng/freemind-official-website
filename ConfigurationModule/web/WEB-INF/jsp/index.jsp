<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/7/22 0022
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" class="no-js">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">
    <script>
        var doc = document, docEl = doc.documentElement;
        docEl.className = docEl.className.replace(/(^|\s)no-js(\s|$)/, " js ");
    </script>
    <script src="${pageContext.request.contextPath}/resources/js/responsive-nav.js"></script>
    <title></title>
</head>
<body>
<div role="navigation" id="nav" style="margin-top:40px;">
    <ul>
        <li><a style="text-decoration: none;">飞迈官网管理页面</a></li>
        <li><a href="#" onClick="changeRightContent('1')">首页展示管理</a></li>
        <li><a href="#" onClick="changeRightContent('2')">功能介绍管理</a></li>
        <li><a href="#" onClick="changeRightContent('3')">成功案例管理</a></li>
    </ul>
</div>
<div class="main">
    <iframe  id="ifream_URL" src=" " style=" margin-left:40px;"  frameborder=no width="95%" height="680"  ></iframe>
</div>
<script>
    var navigation = responsiveNav("#nav", {customToggle: "#toggle"});
</script>

<script type="text/javascript">
    var _gaq = _gaq || [];
    _gaq.push(['_setAccount', 'UA-39967427-1']);
    _gaq.push(['_trackPageview']);
    (function() {
        var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
    })();
    function changeRightContent(id)
    {

        if(id==1)
        {
            document.getElementById("ifream_URL").src='${pageContext.request.contextPath}/slider/sliderMgr.cfg';
            return;
        }
        if(id==2)
        {
            document.getElementById("ifream_URL").src='${pageContext.request.contextPath}/function/funcMgr.cfg ';
            return;
        }
        if(id==3)
        {
            document.getElementById("ifream_URL").src='${pageContext.request.contextPath}/successfulCase/successfulCaseMgr.cfg';
            return;
        }
    }
</script>
</body>
</html>
