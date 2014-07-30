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
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/jQuery.js"></script>
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
    <form id="funcForm" name="funcForm" action="${pageContext.request.contextPath}/function/updateFuncDo.cfg?id=${param.func_Id}" method="post" >
        <p><label id="id" name="id" value="${param.func_Id}">ID:${param.func_Id}</label></p>
        <p><label>功能名称</label><input id="funcName" name="funcName" type="text" style="width:250px;" value="${tFunc.funcName}"></p>
        <p><label>介绍标题</label><input id="funcTitle" name="funcTitle" type="text" style="width:250px;" value="${tFunc.funcTitle}"></p>
        <p><label>父级ID</label><input  id="funcParentId" name="funcParentId" type="text" style="width:250px;" value="${tFunc.funcParentId}"/></p>
        <p>
            <label>介绍图片</label>
            <input type="hidden" id="funcPicUrl" name="funcPicUrl" value="${tFunc.funcPicUrl}" >
            <img   style="width:350px;height:200px;" src="${tFunc.funcPicUrl}" />
        </p>
        <p>
            <label>图标图片</label>
            <input type="hidden" id="funcIconUrl" name="funcIconUrl" value="${tFunc.funcIconUrl}" >
            <img   style="width:150px;height:150px;" src="${tFunc.funcIconUrl}" />
        </p>
        <p><label>介绍描述</label><textarea id="funcDesc" name="funcDesc" class="textComment">${tFunc.funcDesc}</textarea></p>
        <p style="margin-left:65px;">
            <input class="btn" type="button" onclick="doUpdate()" value="提交"/>
            <button class="btn" type="button" onclick="back()">返回</button>
        </p>
    </form>
</div>
</body>
<SCRIPT LANGUAGE="JavaScript">
    function doUpdate()
    {
        var form=$("#funcForm");
        if($("#funcName").val()==""||$("#funcName").val()==null) {
            alert("功能名称不能为空");
            return;
        }
        form.submit();
        return ;
    }
    function back()
    {
        window.location.href="${pageContext.request.contextPath}/function/funcMgr.cfg";
        return;
    }
</SCRIPT>
</html>
