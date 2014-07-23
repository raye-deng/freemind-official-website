<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/7/23 0023
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .mainBody
        {
            font: 100% 微软雅黑;
            margin: 20px auto;
        }
        .textComment
        {
            width:340px;
            overflow:auto;
            word-break:break-all;
        }
        .btn
        {
            border: none;
            background: #34495e;
            color: white;
            font-size: 16.5px;
            text-decoration: none;
            text-shadow: none;
            -webkit-box-shadow: none;
            -moz-box-shadow: none;
            box-shadow: none;
            -webkit-transition: 0.25s;
            -moz-transition: 0.25s;
            -o-transition: 0.25s;
            transition: 0.25s;
            -webkit-backface-visibility: hidden;
        }
        .titlelabel
        {
            font-weight:bold;
            font-size: 18px;
            color: rgba(0, 0, 0, 0.6);
        }
    </style>
    <title>修改轮播图</title>
</head>

<body>
<p><label class="titlelabel">修改轮播图</label></label></p>
<div style="margin:20px auto;margin-left:30px;">
    <p><label>轮播图类型</label></p>
    <p>
    <div style="font-size:12px;">
        <input name="sliderType" type="radio" value="头部轮播图"/>头部轮播图 &nbsp;&nbsp;
        <input name="sliderType" type="radio" value="案例轮播图"/>案例轮播图 &nbsp;&nbsp;
        <input name="sliderType" type="radio" value="合作伙伴轮播图"/>合作伙伴轮播 &nbsp;&nbsp;
    </div>
    </p>

    <p><label>轮播图指向链接</label><input type="text" style="width:250px;"></p>
    <p><label>选择图片</label><img style="width:350px;height:200px;" /></p>
    <p><button style="margin-left:260px;" class="btn">选择图片</button></p>
    <p><label>轮播图介绍</label><textarea  class="textComment"></textarea></p>
    <p style="margin-left:65px;"><button class="btn">提交</button> <button class="btn" onclick="back()">返回</button></p>
</div>

</body>
<script language="JavaScript">
    function back()
    {
        window.location.href="sliderMgr.cfg";
    }
</script>
</html>
