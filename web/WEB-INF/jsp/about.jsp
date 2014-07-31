<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邓风森
  Date: 2014/7/22
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>微领域-关于我们</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/about.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jquery-2.0.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/zzsc.js"></script>
</head>
<body>

<!--顶部导航-->
<div id="header" style="z-index: 9999;position: fixed;top: 0;left: 0;">
    <jsp:include page="/common/header.do"/>
</div>

<div class="pageContent">

    <div style=" margin-top:70px;width: 100%;">
        <img width="100%" height="150px" src="${pageContext.request.contextPath}/resources/images/aboutUs/aboutushead.png">
    </div>
    <center>
        <div style="min-width: 1024px;">
            <div class="goods">
                <div class="all-goods">
                    <div class="itemhead">
                        <div class="product">
                            <h3>
                                <a><strong>关于我们</strong></a>
                                <a style="font-size: 13px; !important">About us</a>
                            </h3>
                        </div>
                    </div>
                    <c:forEach items="${aboutUs}" var="aboutUsList">
                        <div class="item" id="${aboutUs.id}">
                            <div class="product">
                                <h3> <a>${aboutUs.caseName}</a> </h3>
                            </div>
                            <div class="product-wrap posone">
                                <div>
                                    <div>
                                        <p>${aboutUs.caseTitile}</p>
                                        <img  class="productimg"  src="${pageContext.request.contextPath}${aboutUs.casePicUrl}">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                </div>

                <div class="child-page">
                    <p class="child-page-title">当前位置：网站首页&gt;<strong>关于我们</strong></p>
                </div>
            </div>
        </div>
    </center>
</div>
<div style="width: 1024px">&nbsp;</div>

<%--页脚--%>
<div style="min-width: 1024px;width: 100%; background: #292F36;min-height:300px;padding-top:30px;float: left;">
    <center>
        <jsp:include page="/common/footer.do"/>
    </center>
</div>
</body>
</html>
