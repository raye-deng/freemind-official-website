<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/7/23 0023
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
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
        .tableview
        {
            display: table-cell;
            vertical-align: bottom;
            padding-bottom: 5px;
            padding-top: 20px;
            padding-left: 5px;
            border-bottom: 1px #ddd solid;
            border-right: 1px #ddd solid;
            border-left: 2px transparent solid;
            border-top: 3px transparent solid;
            border:1px;
            font-family: 'Segoe UI', 'Open Sans', Verdana, Arial, Helvetica, sans-serif;
            font-weight:400 ;
            font-size: 11pt;
            letter-spacing: 0.01em;
            line-height: 22pt;
            font-smooth: always;
            color: rgba(0, 0, 0, 0.6);
            text-align: center;
            width:830px;
            font-weight:bold;
            table-layout:fixed;
            word-break:break-all;
        }
        .titlelabel
        {
            font-weight:bold;
            font-size: 18px;
            color: rgba(0, 0, 0, 0.6);
        }
        .aCSS
        {
            color:rgba(0, 0, 0, 0.6);
            text-decoration:none;
        }
    </style>
    <title>首页轮播图管理</title>
</head>
<body class="body">
<p><label class="titlelabel">首页轮播图管理</label></p>
<div  style="text-align:left;margin:10px;margin-left:595px; ">
    <button class="btn" onclick="newFuncOnMouseDown()">新增轮播图</button>&nbsp;&nbsp;
    <button class="btn" onclick="updateFuncOnMouseDown()">修改轮播图</button>&nbsp;&nbsp;
    <button class="btn" onclick="delSliderOnMouseDown()">删除介绍</button>
</div>
<div>
    <table id="TableView" class="tableview" >
        <thead>
        <tr bgcolor="#34495e" style="color:#FFFFFF;">
            <th width="50px">ID</th>  <th width="150px">轮播图名称</th>   <th width="320px">轮播图片</th>   <th width="200px">功能描述</th>  <th width="200px">链接地址</th>
        </tr>
        </thead>
        <tbody id="tableBody">
        <tr bgcolor="#ffffff" onclick="trOnMouseDown(this)">
            <td>292</td>  <td>特别的测试</td>  <td><img src="" style=" width:320px; height:180px;"/></td>  <td>4</td> <td>5</td>
        </tr>

        <c:forEach  items="${tSliderList}" var="tSlider">
            <tr bgcolor="#ffffff" onclick="trOnMouseDown(this)">
                <td>${tSlider.id}</td>  <td>${tSlider.sliderFlag}</td>  <td><img src="${tSlider.imgUrl}" style=" width:320px; height:180px;"/></td>  <td>${tSlider.imgDesc}</td> <td><a class="aCSS" href="${tSlider.targetUrl}">链接地址</a></td>
            </tr>
        </c:forEach>

        </tbody>
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

    function newFuncOnMouseDown()
    {
        window.location.href="${pageContext.request.contextPath}/slider/newSlider.cfg";
    }
    function updateFuncOnMouseDown()
    {
        if(lastTr==null)
        {
            alert("请选择要修改的介绍内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/slider/updateSlider.cfg?sliderId="+lastTr.cells[0].innerHTML;
    }
    function delSliderOnMouseDown()
    {
        if(lastTr==null)
        {
            alert("请选择要删除的内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/slider/delSlider.cfg?id="+lastTr.cells[0].innerHTML;

    }


</SCRIPT>
</html>
