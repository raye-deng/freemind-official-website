<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/1 0001
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/jQuery.js"></script>
    <title>新增成功案例</title>
    <style>
        .mainBody
        {
            font: 100% '微软雅黑';
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
</head>
<body>
<p><label class="titlelabel">新增功能介绍</label></p>
<form id="tForm" action="${pageContext.request.contextPath}/successfulCase/newSuccessfulCaseDo.cfg" method="post" >
    <p>
        <label>案例名称</label>
        <input  id="caseName" name="caseName" type="text" style="width:250px;"/>
    </p>
    <p>
        <label>案例名称</label>
        <input  id="caseTitle" name="caseTitle" type="text" style="width:250px;"/>
    </p>
    <p>
        <label>案例图标</label>
        <input type="hidden" id="caseImgUrl" name="caseImgUrl"  >
        <img style="width:150px;height:150px;"  />
    </p>
    <p>
        <label>介绍描述</label>
        <textarea id="caseDesc" name="caseDesc" class="textComment"></textarea>
    </p>
    <p>
        <label>案例链接</label>
        <input  id="caseGuideUrl" name="caseGuideUrl" type="text" style="width:250px;"/></p>
    <p style="margin-left:65px;">
        <button onclick="doSave()" class="btn">提交</button>
        <button onclick="back()" type="button"  class="btn">返回</button>
    </p>
</form>
</body>
<script LANGUAGE="JavaScript">
    function doSave()
    {
        var form=$("#tForm");
        if($("#caseName").val()==""||$("#caseName").val()==null)
            alert("案例名称不能为空");
        form.submit();
    }
    function back()
    {
        window.location.href="${pageContext.request.contextPath}/successfulCase/successfulCaseMgr.cfg";
    }
</script>
</html>
