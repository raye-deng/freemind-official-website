<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邓风森
  Date: 2014/7/22
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>微领域-产品与功能${funcId}</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/products.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jquery-2.0.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/zzsc.js"></script>
</head>
<body onload="setActive(${funcId})">
<!--顶部导航-->
<div id="header" style="z-index: 9999;position: fixed;top: 0;left: 0;">
    <jsp:include page="/common/header.do"/>
</div>

<div class="pageContent">

    <div style=" margin-top:70px;"><img width="100%" src="${pageContext.request.contextPath}/resources/images/prodoucts/head.png"></div>

    <div style=" margin-left:100px;position: relative;margin-bottom: 50px;">
        <div class="goods">
            <div class="all-goods" style=" margin-left:30px; margin-top:20px;float: left;">
                <div class="itemhead">
                    <div class="product">
                        <h3>
                            <a><strong>服务功能</strong></a>
                            <a style="font-size: 13px; !important">service function</a>
                        </h3>
                    </div>
                </div>
                <c:forEach  items="${tFuncList}" var="func">
                    <c:if test="${func.funcParentId==-1}">
                        <div class="itemheadchild" id="${func.id}">
                            <div class="product">
                                <h3><a><strong>${func.funcName}</strong></a></h3>
                            </div>
                        </div>
                        <c:forEach  items="${tFuncList}" var="childfunc">
                            <c:if test="${childfunc.funcParentId==func.id}">
                                <div class="item" id="${childfunc.id}">
                                    <div class="product">
                                        <h3> <a>${childfunc.funcName}</a> </h3>
                                    </div>
                                    <div class="product-wrap posone">
                                        <div>
                                            <div>
                                                <p style="margin-left: 80px;">${childfunc.funcTitle}</p>
                                                <img style="max-height: 900px;max-width: 750px;margin-left: 50px;" src="${pageContext.request.contextPath}${childfunc.funcPicUrl}">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%--<c:if test="${childfunc.id==funcId}" >--%>
                                <%--setActive(${funcId});--%>
                                <%--</c:if>--%>
                            </c:if>

                        </c:forEach>
                    </c:if>

                </c:forEach>
                <div class="itemhead">
                    <div class="product">
                        <h3>
                            <a><strong>硬件产品   </strong></a>
                            <a style="font-size: 13px; !important">hardware product</a>
                        </h3>
                    </div>
                </div>

                <c:forEach  items="${tFuncList}" var="funchard">
                    <c:if test="${funchard.funcParentId==-2}">
                        <div class="itemheadchild" id="${funchard.id}">
                            <div class="product">
                                <h3><a><strong>${funchard.funcName}</strong></a></h3>
                            </div>
                        </div>
                        <c:forEach  items="${tFuncList}" var="childfunchard">
                            <c:if test="${childfunchard.funcParentId==funchard.id}">
                                <div class="item" id="${childfunchard.id}">
                                    <div class="product">
                                        <h3> <a>${childfunchard.funcName}</a> </h3>
                                    </div>
                                    <div class="product-wrap posone">
                                        <div>
                                            <div>
                                                <p style="margin-left: 80px;">${childfunchard.funcTitle}</p>
                                                <img style="max-height: 900px;max-width: 750px;margin-left: 50px;" src="${pageContext.request.contextPath}${childfunchard.funcPicUrl}">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:if>
                        </c:forEach>
                    </c:if>
                    <c:if test="${funchard.funcParentId==-4}">
                        <div class="item" id="${funchard.id}">
                            <div class="product">
                                <h3> <a>${funchard.funcName}</a> </h3>
                            </div>
                            <div class="product-wrap posone">
                                <div>
                                    <div>
                                        <p style="margin-left: 80px;">${funchard.funcTitle}</p>
                                        <img style="max-height: 900px;max-width: 750px;margin-left: 50px;" src="${pageContext.request.contextPath}${funchard.funcPicUrl}">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:if>
                </c:forEach>
                <div class="itemhead">
                    <div class="product">
                        <h3>
                            <a><strong>其他</strong></a>
                            <a style="font-size: 13px; !important">&nbsp;&nbsp;Else</a>
                        </h3>
                    </div>
                </div>
                <c:forEach  items="${tFuncList}" var="funcelse">
                    <c:if test="${funcelse.funcParentId==0}">
                        <div class="item" id="${funcelse.id}">
                            <div class="product">
                                <h3> <a>${funcelse.funcName} </a> </h3>
                            </div>
                            <div class="product-wrap posone">
                                <div>
                                    <div>
                                        <p style="margin-left: 80px;">${funcelse.funcTitle}</p>
                                        <img style="max-height: 900px;max-width: 750px;margin-left: 50px;" src="${pageContext.request.contextPath}${funcelse.funcPicUrl}">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:if>
                </c:forEach>
            </div>

            <div style="margin-top:20px;float: left;height: 1000px;position: relative;width: 840px; box-shadow:-4px 1px 4px -2px #CCC;">
                <p style="width:100%;margin-top:5px;margin-left:40px;font-size: 14px; border-bottom: 1px #CCCCCC solid; !important">当前位置：网站首页&gt;<strong>产品与功能</strong></p>
            </div>
        </div>
    </div>
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