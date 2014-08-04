<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/1 0001
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
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

        .trStyle
        {
            display: table-row-group;
            font-weight:bold;
            font-size: 18px;
            letter-spacing: 0.01em;
            color: rgba(0, 0, 0, 0.6);
            padding-left: 5px;

        }
        .scrollTable {
            max-height: 550px;;
            overflow-x: hidden;
            overflow-y: auto;
            max-width: 860px;
            word-wrap:break-word;

        }
        .aCSS
        {
            color:rgba(0, 0, 0, 0.6);
            text-align:center;

        }
    </style>
    <title>企业介绍页面管理</title>
</head>
<body class="body">
<p><label class="titlelabel">企业介绍管理</label></p>
<div style="position: fixed; text-align:right;margin-top: 10px;">
    <button class="btn" onclick="newAboutUsOnMouseDown()">新增介绍</button>&nbsp;&nbsp;
    <button class="btn" onclick="updateAboutUsOnMouseDown()">修改介绍</button>&nbsp;&nbsp;
    <button class="btn" onclick="delAboutUsOnMouseDown()">删除介绍</button>
</div>
<div style="height:400px;">
    <table style=" margin-top: 60px;" >
        <tr bgcolor="#34495e" style="color:#FFFFFF; ">
            <th width="50px">ID</th>  <th width="200px">侧边栏名称</th>   <th width="220px">简要描述</th>
        </tr>
        <td colspan="3">
            <div class="scrollTable">
                <table border="1px"  style="border-color:#dcdcdc; position: fixed;">
                    <c:forEach  items="${tAboutUsList}" var="tAboutUs">
                        <tr class="trStyle" bgcolor="#ffffff"  onclick="trOnMouseDown(this)">
                            <td style="text-align:center;width:50px;">${tAboutUs.id}</td>
                            <td style="text-align:center;width:200px">${tAboutUs.title}</td>
                            <td style="width:210px">${tAboutUs.aboutDesc}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </td>
    </table>
</div>
</body>
<script language="JavaScript">
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

    function newAboutUsOnMouseDown(){
        window.location.href="${pageContext.request.contextPath}/aboutUs/newAboutUs.cfg";
    }

    function updateAboutUsOnMouseDown(){
        if(lastTr==null)
        {
            alert("请选择要修改的介绍内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/aboutUs/updateAboutUs.cfg?id="+lastTr.cells[0].innerText;
    }

    function delAboutUsOnMouseDown(){
        if(lastTr==null)
        {
            alert("请选择要删除的内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/aboutUs/delAboutUsDo.cfg?id="+lastTr.cells[0].innerText;

    }
</script>
</html>
