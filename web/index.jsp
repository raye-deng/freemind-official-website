<%--
  Created by IntelliJ IDEA.
  User: 邓风森
  Date: 2014/7/16
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>微领域</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jquery-2.0.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/common/header.js"></script>
    <style>
        .banner { position: relative; overflow: auto; margin-top:70px;}
        .banner li { list-style: none; }
        .banner ul li {float: left;width: 103%;height:460px;}
    </style>
</head>
<body style="background: #eee;position: relative;">
<!--顶部导航-->
<div id="header">
    <jsp:include page="common/fixedHeader.do"/>
</div>
<%--轮播图--%>

</body>
</html>
