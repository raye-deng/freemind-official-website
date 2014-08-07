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

    <link href="${pageContext.request.contextPath}/resources/css/common/slider/caseSlide.css" rel="stylesheet" type="text/css" />
    <link rel='stylesheet' id='camera-css'  href='${pageContext.request.contextPath}/resources/css/common/slider/camera.css' type='text/css' media='all'>
    <link rel='stylesheet' id='home-css'  href='${pageContext.request.contextPath}/resources/css/home/home.css' type='text/css' media='all'>
    <link rel='stylesheet' href='${pageContext.request.contextPath}/resources/css/common/slider/caseSlide.css' type='text/css' media='all'>
    <link rel='stylesheet' href='${pageContext.request.contextPath}/resources/css/common/css/font-awesome.css' type='text/css' media='all'>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jquery-2.0.0.min.js"></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.mobile.customized.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.easing.1.3.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/camera.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/company_mates.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/useCase.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/announcement.js'></script>

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
<body style="background: #fff;position: relative;font-family: 'huaKanYuanTi'">
<div style="height: 540px;">
    <div class="fluid_container">
        <div class="camera_wrap camera_emboss pattern_1" id="camera_wrap_4">
            <c:forEach  items="${tCameraSliderImgList}" var="cameraSlide">
                <div data-src="${pageContext.request.contextPath}${cameraSlide.imgUrl}">
                </div>
            </c:forEach>
        </div><!-- #camera_wrap_3 -->

    </div>
</div>
<!-- 公告轮播 -->
<center>

<div>
    <div id="breakingnews" class="BreakingNewsController easing" id="breakingnews1">
        <div class="bn-title icon-bullhorn" style="font-size: 30px;color:#4fade2;"></div>
        <ul style="left: 50px;">
            <c:forEach  items="${newsList}" var="news">
                <li style="display: none;"><a class="annView">${news.newsContent}</a></li>
            </c:forEach>
        </ul>
        <div class="bn-arrows"><span class="bn-arrows-left"></span><span class="bn-arrows-right"></span></div>
    </div>
    </div>
</div>
</center>
<%--产品列表--%>
<div id="contentdiv" name="congentdiv" class="home_content">
    <div id="productListdiv" name="productListdiv" class="product_list_div">
        <center>
            <div>
                <img src="${pageContext.request.contextPath}/resources/images/home/productListTitleImg.jpg">
            </div>
            <ul id="productList" name="productList" class="product_list">

                <c:forEach  items="${tFuncDtoList}" var="tFunc" begin="0" end="24">
                    <c:if test="${tFunc.funcParentId>0}">
                        <li>
                            <div >
                                <a href="javascript:toFuncPage(${tFunc.id})">
                                <img src="${pageContext.request.contextPath}${tFunc.funcIconUrl}">
                                <div>
                                    <p>${tFunc.funcName}</p>
                                    <span>${tFunc.funcTitle}</span>
                                </div>
                                </a>
                            </div>
                        </li>
                    </c:if>
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
        <div class="blk_18">
            <a class="LeftBotton" onmousedown="ISL_GoUp_1()" onmouseup="ISL_StopUp_1()" onmouseout="ISL_StopUp_1()" href="javascript:void(0);" target="_self"></a>
            <div class="pcont" id="ISL_Cont_1" style="margin-left: 8px;">
                <div class="ScrCont">
                    <div id="List1_1">
                        <c:forEach varStatus="status" begin="0" items="${tCaseSliderImgList}" var="tCaseSlide" step="1">
                            <a class="pl" href="${pageContext.request.contextPath}${tCaseSlide.targetUrl}" ><img src="${pageContext.request.contextPath}${tCaseSlide.imgUrl}" alt="${tCaseSlide.imgDesc}"/></a>
                        </c:forEach>
                    </div>
                    <div id="List2_1"></div>
                </div>
            </div>
            <a class="RightBotton" onmousedown="ISL_GoDown_1()" onmouseup="ISL_StopDown_1()" onmouseout="ISL_StopDown_1()" href="javascript:void(0);" target="_self"></a> </div>
        <div class="sildPicBarCase">
            <a onmousedown="ISL_GoUp_1()" onmouseup="ISL_StopUp_1()" onmouseout="ISL_StopUp_1()" href="javascript:void(0);" target="_self"><span class="pre">&nbsp;</span></a>
            <a onmousedown="ISL_GoDown_1()" onmouseup="ISL_StopDown_1()" onmouseout="ISL_StopDown_1()" href="javascript:void(0);" target="_self"><span class="next">&nbsp;</span></a>
        </div>
        <div class="c"></div>
        <script type="text/javascript">
            <!--
            picrun_ini()
            //-->
        </script>
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
                <div class="cnt-wrap" id="cnt-wrap" style="position: absolute; left: 40px; !important">
                    <div class="cnt" id="cnt" style="position: absolute; left: 30px; !important">
                        <ul >
                            <c:forEach  items="${tPartnerSliderImgList}" var="tPartner">
                                <li>
                                    <a href="javascript:;">
                                        <img src="${pageContext.request.contextPath}${tPartner.imgUrl}" title="${tPartner.imgDesc}" alt="${tPartner.imgDesc}">
                                    </a>
                                </li>
                            </c:forEach>
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
    <jsp:include page="/common/header.do"/>
</div>
<%--页脚--%>
<div style="min-width: 1024;width: 100%;overflow:hidden ">
    <center>
        <jsp:include page="/common/footer.do"/>
    </center>
</div>
</body>

<script type="text/javascript">
    function toFuncPage(funcId){
        location.href="${pageContext.request.contextPath}/products.do?funcId="+funcId;
    }
</script>
</html>
<script type="text/javascript">
    $("#breakingnews").BreakingNews({
        background      :"#FFF",
        titlecolor      :"#4fade2",
        titlebgcolor        :"#FFF",
        linkcolor       :"#333",
        linkhovercolor      :"#4fade2",
        fonttextsize        :16,
        isbold          :false,
        border          :"solid 0px #099",
        width           :"50%",
        timer           :3000,
        autoplay        :true,
        effect          :"slide"
    });
</script>