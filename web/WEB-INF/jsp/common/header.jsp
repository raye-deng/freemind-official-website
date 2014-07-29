<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<title>微领域</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common/head-style.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common/head-nav.js"></script>
</head>
<body>
<div id="top_bg">
	<div class="top">
		<a class="logo_l" href="#" title="返回首页"></a>
		<!--导航开始-->
		<div class="nav_z">
        	<center>
			<ul id="navul" class="cl" style="min-width:700px;width:700px;">
                <c:forEach  items="${navList}" var="item">
                    <c:if test="${item.parentId==0}">
                        <li>
                            <c:if test="${item.navUrl=='#'}">
                                <a id="nav${item.id}" style="color: #fff;">${item.navName}</a>
                            </c:if>
                            <c:if test="${item.navUrl!='#'}">
                                <a href="${pageContext.request.contextPath}/${item.navUrl}"  id="nav${item.id}" >${item.navName}</a>
                            </c:if>
                            <ul>
                                <c:forEach  items="${navList}" var="childItem">
                                    <c:if test="${childItem.parentId==item.id}"><li><a href="${childItem.navUrl}" id="nav${childItem.id}" >${childItem.navName}</a></li></c:if>
                                </c:forEach>
                            </ul>
                        </li>
                    </c:if>
                </c:forEach>
				<!--可在此处直接添加导航-->
			</ul>
            </center>
		</div><!--导航结束-->
		<script  type="text/javascript"> 
		$(".navbg").capacityFixed();
		</script>
	</div>
</div>
</body>
</html>
