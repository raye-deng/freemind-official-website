<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/1 0001
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/jQuery.js"></script>
<title>新增成功案例</title>
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
<form id="tForm" action="${pageContext.request.contextPath}/successfulCase/updateSuccessfulCaseDo.cfg?id=${param.id}" method="post" >
    <p>
        <label>案例编号:${param.id}</label>
    </p>
    <p>
        <label>案例名称</label>
        <input  id="caseName" name="caseName" type="text" style="width:250px;" value="${tCase.caseName}"/>
    </p>
    <p>
        <label>案例名称</label>
        <input  id="caseTitle" name="caseTitle" type="text" style="width:250px;" value="${tCase.caseTitle}"/>
    </p>
    <p>
        <label>案例图标</label>
        <input type="hidden" id="caseImgUrl" name="caseImgUrl"  value="${tCase.caseImgUrl}" >
        <img style="width:150px;height:150px;" src="${tCase.caseImgUrl}" />
    </p>
    <p>
        <label>介绍描述</label>
        <textarea id="caseDesc" name="caseDesc" class="textComment">${tCase.caseDesc}</textarea>
    </p>
    <p>
        <label>案例链接</label>
        <input  id="caseGuideUrl" name="caseGuideUrl" type="text" style="width:250px;" value="${tCase.caseGuideUrl}"/></p>
    <p style="margin-left:65px;">
        <button onclick="doUpdate()" class="btn">提交</button>
        <button onclick="back()" type="button"  class="btn">返回</button>
    </p>
</form>
</body>
<SCRIPT LANGUAGE="JavaScript">
    function doUpdate()
    {
        var form=$("#tForm");
        if($("#caseName").val()==""||$("#caseName").val()==null) {
            alert("案例名称不能为空");
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
    function deleteSpace(value){
        return value.trim();
    }
</SCRIPT>
</html>
