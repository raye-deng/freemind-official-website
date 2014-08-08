<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/1 0001
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/jQuery.js"></script>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/ImgPreview.js"></script>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/ajaxfileupload.js"></script>
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
        <input style="display: none;" id="caseImgUrl"  name="caseImgUrl" value="${tCase.caseImgUrl}">
        <input id="chooseImgFile" name="chooseImgFile" type="file"style="display: none;" onchange='PreviewImage("ImgPreview",this,"350","100%")' />
        <input type="button" class="btn" onclick="chooseImgFile.click()" value="选择图片">
        <div id="ImgPreview" style='max-width:350px;margin-bottom:20px;'>
            <img <c:choose>
                     <c:when test="${tCase.caseImgUrl==null}">src="${pageContext.request.contextPath}/resources/images/PreviewBig.jpg"</c:when>
                     <c:otherwise>src="${pageContext.request.contextPath}${tCase.caseImgUrl}"</c:otherwise>
                 </c:choose>
             style='width:350px;'/>
        </div>
        <input type="button" class="btn" onclick="upLoadImg('ImgPreview','chooseImgFile','caseImgUrl','350','100%')" value="上传图片"/>
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
    function upLoadImg(divId,upId,imgId,widthT,heightT){

        if(document.getElementById(upId).value.toString()=="")
        {
            alert("请先选择要上传的图片");
            return;
        }

        $.ajaxFileUpload({
            url : "${pageContext.request.contextPath}/common/upLoadImg.json",
            type:"post",
            secureuri: false,
            dataType:"text",
            fileElementId: upId,
            success : function(data) {
                alert("图片已上传");
                document.getElementById(imgId).value=data;
                document.getElementById(divId).innerHTML = "<img style='width:"+widthT+"px;height:"+heightT+"px;'"+ "src='${pageContext.request.contextPath}"+data+"'/>";
            },
            error: function (data, status, e){
                alert("error:"+e);
            }
        });

    }
</SCRIPT>
</html>
