<%--
  Created by IntelliJ IDEA.
  User: Gjx
  Date: 2014/7/31 0031
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/jQuery.js"></script>
    <style>
        .titlelabel{
            font-size:20px;
            font-weight: bold;
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

        .scrollTable {
            max-height: 480px;
            overflow-x: hidden;
            overflow-y: auto;
            max-width: 860px;
            word-wrap:break-word;
        }

    </style>
    <title>成功案例管理页面</title>
</head>
<body class="body">
<p><label class="titlelabel">成功案例管理</label></p>
<div style="position: fixed; text-align:right;margin-top: 10px;">
    <button class="btn" onclick="newCaseOnMouseDown()">新增案例</button>&nbsp;&nbsp;
    <button class="btn" onclick="updateCaseOnMouseDown()">修改案例</button>&nbsp;&nbsp;
    <button class="btn" onclick="delCaseOnMouseDown()">删除案例</button>
</div>
<div >
    <table style=" margin-top: 60px; width: 860px;" >
        <tr bgcolor="#34495e" style="color:#FFFFFF; ">
            <th width="5%">ID</th>
            <th width="15%">案例名称</th>
            <th width="10%">案例标题</th>
            <th width="25%">案例描述</th>
            <th width="25%">案例图片</th>
            <th width="20%">链接地址</th>
        </tr>
        <td colspan="6">
            <div class="scrollTable">
                <table border="1px" style="border-color:#dcdcdc;width: 860px;">
                    <c:forEach  items="${tSuccessfulCaseList}" var="tSuccessfulCase">
                        <tr  style=" height:30px; font-size: 15px;color:rgba(0, 0, 0, 0.6) ;font-weight:bold;" bgcolor="#ffffff" onclick="trOnMouseDown(this)">
                            <td style="text-align: center;width:40px;">
                                ${tSuccessfulCase.id}
                            </td>
                            <td style="text-align: center;width:120px;">
                                <div style="width:120px; word-wrap:break-word;">
                                    ${tSuccessfulCase.caseName}
                                </div>
                            </td>
                            <td style="text-align: center;width:120px;">
                                <div style="width:120px; word-wrap:break-word;">
                                    ${tSuccessfulCase.caseTitle}
                                </div>
                            </td>
                            <td >
                                <div style="width:220px; word-wrap:break-word;">
                                    ${tSuccessfulCase.caseDesc}
                                </div>
                            </td>
                            <td style="text-align: center;width:200px;">
                                <img style="width:180px;height:180px;text-align: center; " src="${pageContext.request.contextPath}${tSuccessfulCase.caseImgUrl}">
                            </td>
                            <td>
                                <div style="width:160px; word-wrap:break-word;">
                                    ${tSuccessfulCase.caseGuideUrl}
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </td>
    </table>
</div>
</body>
<SCRIPT LANGUAGE="JavaScript">
    var lastTr=null;
    function trOnMouseDown(obj){
        if(lastTr!=null)
        {
            lastTr.bgColor="#ffffff";
        }
        if(obj.bgColor=="#ffffff")
            obj.bgColor="#4682b4";
        lastTr = obj;
    }
    function newCaseOnMouseDown(){
        window.location.href="${pageContext.request.contextPath}/successfulCase/newSuccessfulCase.cfg";
    }
    function updateCaseOnMouseDown(){
        if(lastTr==null)
        {
            alert("请选择要修改的介绍内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/successfulCase/updateSuccessfulCase.cfg?id="+lastTr.cells[0].innerText;
    }
    function delCaseOnMouseDown()
    {
        if(lastTr==null)
        {
            alert("请选择要删除的内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/successfulCase/delSuccessfulCase.cfg?id="+lastTr.cells[0].innerText;

    }
</SCRIPT>
</html>
