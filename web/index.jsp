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
    <link rel='stylesheet' id='camera-css'  href='${pageContext.request.contextPath}/resources/css/common/slider/camera.css' type='text/css' media='all'>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.mobile.customized.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/jquery.easing.1.3.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/common/slider/camera.js'></script>
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
        #back_to_camera {
            background: rgba(255,255,255,.9);
            clear: both;
            display: block;
            height: 40px;
            line-height: 40px;
            padding: 20px;
            position: relative;
            z-index: 1;
        }
        .fluid_container {
            bottom: 0;
            height: 470px;
            left: 0;
            position: fixed;
            right: 0;
            top:70px;
            z-index: 0;

        }
        #camera_wrap_4 {
            bottom: 0;
            height: 100%;
            left: 0;
            margin-bottom: 0!important;
            position: fixed;
            right: 0;
            top: 70px;
        }
        .camera_bar {
            z-index: 2;
        }
        .camera_thumbs {
            margin-top: -100px;
            position: relative;
            z-index: 1;
        }
        .camera_thumbs_cont {
            border-radius: 0;
            -moz-border-radius: 0;
            -webkit-border-radius: 0;
        }
        .camera_overlayer {
            opacity: .1;
        }
    </style>
    <script>
        jQuery(function(){

            jQuery('#camera_wrap_4').camera({
                height: 'auto',
                loader: 'bar',
                pagination: false,
                thumbnails: true,
                hover: false,
                opacityOnGrid: false,
                imagePath: '../images/'
            });

        });
    </script>
</head>
<body style="background: #eee;position: relative;">
<!--顶部导航-->
<div id="header">
    <jsp:include page="common/fixedHeader.do"/>
</div>
<%--轮播图--%>
<%--<div class="banner">
    <ul>
        <li style="background: url(http://www.bootcss.com/p/unslider/img/wood.jpg);background-size:150%;" >This is a slide.</li>
        <li style="background: url(http://www.bootcss.com/p/unslider/img/subway.jpg);background-size:150%;" >This is a slidea.</li>
    </ul>
</div>
<script>
    $('.banner').unslider({
        speed: 800,               //  The speed to animate each slide (in milliseconds)
        delay: 2000,              //  The delay between slide animations (in milliseconds)
        complete: function() {},  //  A function that gets called after every slide animation
        keys: true,               //  Enable keyboard (left, right) arrow shortcuts
        dots: true,               //  Display dot navigation
        fluid: false              //  Support responsive design. May break non-responsive designs
    });
</script>--%>

<%--<div class="fluid_container">--%>
    <%--<div class="camera_wrap camera_emboss pattern_1" id="camera_wrap_4">--%>
        <%--<div data-thumb="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/bridge.jpg" data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/bridge.jpg">--%>
        <%--</div>--%>
        <%--<div data-thumb="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/leaf.jpg" data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/leaf.jpg">--%>
        <%--</div>--%>
        <%--<div data-thumb="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/road.jpg" data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/road.jpg">--%>
        <%--</div>--%>
        <%--<div data-thumb="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/sea.jpg" data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/sea.jpg">--%>
        <%--</div>--%>
        <%--<div data-thumb="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/shelter.jpg" data-src="${pageContext.request.contextPath}/resources/images/home/slider/slides/thumbs/shelter.jpg">--%>
        <%--</div>--%>
    <%--</div><!-- #camera_wrap_3 -->--%>

<%--</div>--%>


</body>
</html>
