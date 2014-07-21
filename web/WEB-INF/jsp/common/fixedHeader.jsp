<%--
  Created by IntelliJ IDEA.
  User: 邓风森
  Date: 2014/7/16
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>微领域</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common/header.css">
</head>
<body>
<div class="top-line-div">

    <center>
        <div class="logo">
            <img src="${pageContext.request.contextPath}/resources/images/logo_op.png" />
           <!-- <span class="title">微领域</span>
            <span class="phone">业务咨询:400-990-8382</span>-->
        </div>
        <ul   class="navgation">
            <c:forEach  items="${navList}" var="item">
                <c:if test="${item.parentId==0}">
                    <li class="dropdown" >
                        <a href="${pageContext.request.contextPath}${item.navUrl}"  id="nav${item.id}"  data-toggle="dropdown" class="dropdown-toggle">${item.navName}</a>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="nav${item.id}" style="margin-top:18px;margin-left:-3px;">
                            <c:forEach  items="${navList}" var="childItem">
                            <c:if test="${childItem.parentId==item.id}">
                            <li><a href="${childItem.navUrl}" class="navChild" id="nav${childItem.id}" >${childItem.navName}</a></li>
                            </c:if>
                            </c:forEach>
                        </ul>
                    </li>
                </c:if>
            </c:forEach>
        </ul>
    </center>
</div>

</body>
</html>
