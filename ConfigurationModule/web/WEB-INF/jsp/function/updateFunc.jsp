<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/7/22 0022
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
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
    <title></title>
</head>
<body>
<p><label class="titlelabel">修改功能介绍</label></p>
<div style="margin-left:30px;">
    <p><label>功能名称</label><input type="text" style="width:250px;"></p>
    <p><label>介绍标题</label><input type="text" style="width:250px;"></p>
    <p><label>介绍图片</label><img style="width:350px;height:200px;" /></p>
    <p><label>介绍描述</label><textarea  class="textComment"></textarea></p>
    <p style="margin-left:65px;"><button onclick="getFUNC_ID()" class="btn">提交</button> <button class="btn" onclick="back()">返回</button></p>
</div>
</body>
<SCRIPT LANGUAGE="JavaScript">
    function back()
    {
        window.location.href="${pageContext.request.contextPath}/function/funcMgr.cfg";
    }
    function getFUNC_ID()
    {
        alert(${param.func_Id});
    }
</SCRIPT>
</html>
