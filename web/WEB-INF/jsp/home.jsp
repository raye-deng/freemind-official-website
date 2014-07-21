<!--
  Created by IntelliJ IDEA.
  User: 邓风森
  Date: 2014/7/16
  Time: 15:47
  To change this template use File | Settings | File Templates.
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>微领域</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap/css/bootstrap.css">
    <link href="${pageContext.request.contextPath}/resources/css/common/slider/caseSlide.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jquery-2.0.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/common/header.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/common/productShowSlider.js"></script>
    <link rel='stylesheet' id='camera-css'  href='${pageContext.request.contextPath}/resources/css/common/slider/camera.css' type='text/css' media='all'>
    <link rel='stylesheet' id='home-css'  href='${pageContext.request.contextPath}/resources/css/home/home.css' type='text/css' media='all'>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.mobile.customized.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.easing.1.3.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/camera.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/company_mates.js'></script>
    <script language="JavaScript" type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common/slider/case/prototype.js"></script>
    <script language="JavaScript" type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common/slider/case/effects.js"></script>
    <script language="JavaScript" type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common/slider/case/glider.js"></script>

    <style>
        html,body {
            height: 100%;
            margin: 0;
            padding: 0;
        }
        a {
            color: #09f;
        }
        a:hover {
            text-decoration: none;
        }
        .fluid_container {
            bottom: 0;
            height: 470px;
            left: 0;
            position: relative;
            right: 0;
            top:0px;
            z-index: 0;
            min-width: 1024px;
            min-height: 470px;
        }
        #camera_wrap_4 {
            bottom: 0;
            height: 100%;
            left: 0;
            margin-bottom: 0!important;
            position: relative;
            right: 0;
            top: 70px;
        }

    </style>
    <script>
        jQuery(function(){

            jQuery('#camera_wrap_4').camera({
                height: 'auto',
                loader: 'bar',
                pagination: false,
                thumbnails: false,
                hover: true,
                opacityOnGrid: false,
                imagePath: '${pageContext.request.contextPath}/resources/images/slider'
            });
        });
    </script>
</head>
<body style="background: #fff;position: relative;">
<div>
    <div class="fluid_container">
        <div class="camera_wrap camera_emboss pattern_1" id="camera_wrap_4">
            <div data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/bridge.jpg">
            </div>
            <div data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/leaf.jpg">
            </div>
            <div data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/road.jpg">
            </div>
            <div data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/sea.jpg">
            </div>
            <div data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/shelter.jpg">
            </div>
        </div><!-- #camera_wrap_3 -->

    </div>
</div>
<%--产品列表--%>
<div id="contentdiv" name="congentdiv" class="home_content">
    <div id="productListdiv" name="productListdiv" class="product_list_div">
        <center>
            <div>
                <img src="${pageContext.request.contextPath}/resources/images/home/productListTitleImg.jpg">
            </div>
            <ul id="productList" name="productList" class="product_list">

                <c:forEach  items="${tFuncDtoList}" var="tFunc">
                    <li>
                        <div >
                            <img src="${pageContext.request.contextPath}${tFunc.funcIconUrl}">
                            <div>
                                <a href="${tFunc.funcGuideUrl}"><p>${tFunc.funcName}</p></a>
                                <span>${tFunc.funcTitle}</span>
                            </div>
                        </div>
                    </li>
                </c:forEach>
            </ul>
        </center>
    </div>
</div>
<%--产品列表结束--%>

<%--用例展示--%>
<div class="product_slider_div">
    <center>
        <h2>他们正在使用微领域</h2>
        <div class="feature" id="my-glider">
            <div class="scroller">
                <div class="content">
                    <div class="section" id="section1">
                        <a href="#" target="_blank"><img alt="用例展示" src="${pageContext.request.contextPath}/resources/upload/1.png"></a>
                        <a href="#" target="_blank"><img alt="用例展示" src="${pageContext.request.contextPath}/resources/upload/2.png"></a>
                        <a href="#" target="_blank"><img alt="用例展示" src="${pageContext.request.contextPath}/resources/upload/3.png"></a>
                        <a href="#" target="_blank"><img alt="用例展示" src="${pageContext.request.contextPath}/resources/upload/4.png"></a>
                    </div>
                    <div class="section" id="section2">
                        <a href="#" target="_blank"><img alt="用例展示" src="${pageContext.request.contextPath}/resources/upload/5.png"></a>
                        <a href="#" target="_blank"><img alt="用例展示" src="${pageContext.request.contextPath}/resources/upload/6.png"></a>
                        <a href="#" target="_blank"><img alt="用例展示" src="${pageContext.request.contextPath}/resources/upload/7.png"></a>
                        <a href="#" target="_blank"><img alt="用例展示" src="${pageContext.request.contextPath}/resources/upload/8.png"></a>
                    </div>
                </div>
            </div>
            <a id="prevLink" onclick="my_glider.previous();return false;" >Previous</a>
            <a id="nextLink" onclick="my_glider.next();return false" >Next</a>
            <script language="javascript" type="text/javascript">
                var my_glider = new Glider('my-glider', {duration:0.5});
                setInterval("my_glider.next();",5000);
            </script>
        </div>

    </center>
</div>
<%--用例展示结束--%>
<%--合作伙伴--%>

<SCRIPT type=text/javascript>
    TencentArticl.onload();
</SCRIPT>
<div class="links">
    <center>

        <div class="mod-left bottom-Article-QQ sildPic-Article-QQ">

            <div class="hd">
                <H2>合作伙伴</H2>
            </div>
            <div class="bd">
                <div class="cnt-wrap" id="cnt-wrap">
                    <div class="cnt" id="cnt">
                        <ul >
                            <li><a href="javascript:;"><img
                                    src="${pageContext.request.contextPath}/resources/images/partner/yinlian.jpg" title="合作伙伴7" alt="合作伙伴7">
                            </a></li>
                            <li><a href="javascript:;"><img
                                    src="${pageContext.request.contextPath}/resources/images/partner/weixin.jpg" title="合作伙伴6" alt="合作伙伴6">
                            </a></li>
                            <li><a href="javascript:;"><img
                                    src="${pageContext.request.contextPath}/resources/images/partner/yidong.jpg" title="合作伙伴5" alt="合作伙伴5">
                            </a></li>
                            <li><a href="javascript:;"><img
                                    src="${pageContext.request.contextPath}/resources/images/partner/liantong.jpg" title="合作伙伴4" alt="合作伙伴4">
                            </a></li>
                            <li><a href="javascript:;"><img
                                    src="${pageContext.request.contextPath}/resources/images/partner/dianxin.jpg" title="合作伙伴3" alt="合作伙伴3">
                            </a></li>
                            <li><a href="javascript:;"><img
                                    src="${pageContext.request.contextPath}/resources/images/partner/friend.jpg" title="合作伙伴2" alt="合作伙伴2">
                            </a></li>
                            <li><a href="javascript:;"><img
                                    src="${pageContext.request.contextPath}/resources/images/partner/gold.jpg" title="合作伙伴1" alt="合作伙伴1">
                            </a></li>

                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="sildPicBar" id="sildPicBar">
            <span class="pre">&nbsp;</span>
            <span class="next">&nbsp;</span>
        </div>
    </center>
</div>

<%--合作伙伴 结束--%>
<!--顶部导航-->
<div id="header" style="z-index: 9999;position: fixed;top: 0;left: 0;">
    <jsp:include page="/common/fixedHeader.do"/>
</div>
<%--页脚--%>
<div style="min-width: 1024px;width: 100%; background: #292F36;min-height:300px;padding-top:30px;">
    <center>
    <jsp:include page="/common/footer.do"/>
    </center>
</div>
</body>
</html>
