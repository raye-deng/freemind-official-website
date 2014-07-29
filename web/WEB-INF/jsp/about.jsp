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

    <div style=" margin-top:70px;"><img width="100%" src="${pageContext.request.contextPath}/resources/images/aboutUs/aboutushead.png"></div>

    <div style=" margin-left:100px;position: relative;margin-bottom: 50px;">
        <div class="goods">
            <div class="all-goods" style=" margin-left:30px; margin-top:20px;float: left;">
                <div class="itemhead">
                    <div class="product">
                        <h3>
                            <a><strong>关于我们</strong></a>
                            <a style="font-size: 13px; !important">About us</a>
                        </h3>
                    </div>
                </div>
                <div class="item" id="item0">
                    <div class="product">
                        <h3><a>企业简介</a> </h3>
                    </div>
                    <div class="product-wrap posone">
                        <div>
                            <center>
                                <div>
                                    <h1>企业简介</h1>
                                </div>
                            </center>
                            <div>&nbsp; </div>
                            <div style="margin-left:50px;word-wrap:break-word;">
                                fdsjjjjjjjjjjjjjjjjjjjjjsjfffffffffffffffffffffffffffffffjffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffzxzcxzcxczcxcxccssswqqqq
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item" id="item1">
                    <div class="product">
                        <h3> <a>企业文化</a> </h3>
                    </div>
                    <div class="product-wrap posone">
                        <div>
                            <center>
                            <div>
                                <h1>企业简介</h1>
                            </div>
                            </center>
                        </div>
                    </div>
                </div>
                <div class="item" id="item2">
                    <div class="product">
                        <h3> <a>团队实力</a> </h3>
                    </div>
                    <div class="product-wrap posone">
                        <div>
                            <div>
                                <img style="max-height: 900px;max-width: 750px;margin-left: 50px;" src="${pageContext.request.contextPath}/resources/images/prodoucts/wfood.png">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item" id="item3">
                    <div class="product">
                        <h3> <a>人才招聘</a> </h3>
                    </div>
                    <div class="product-wrap posone">
                        <div>
                            <div>
                                <img style="max-height: 900px;max-width: 750px;margin-left: 50px;" src="${pageContext.request.contextPath}/resources/images/prodoucts/wfood.png">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item" id="item4">
                    <div class="product">
                        <h3> <a>联系我们</a> </h3>
                    </div>
                    <div class="product-wrap posone">
                        <div>
                            <div>
                                <img style="max-height: 900px;max-width: 750px;margin-left: 50px;" src="${pageContext.request.contextPath}/resources/images/prodoucts/wfood.png">
                            </div>
                        </div>
                    </div>
                </div>

            </div>

            <div style="margin-top:20px;float: left;height: 1000px;position: relative;width: 840px; box-shadow:-4px 1px 4px -2px #CCC;">
                <p style="width:100%;margin-top:5px;margin-left:40px;font-size: 14px; border-bottom: 1px #CCCCCC solid; !important">当前位置：网站首页&gt;<strong>关于我们</strong></p>
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
