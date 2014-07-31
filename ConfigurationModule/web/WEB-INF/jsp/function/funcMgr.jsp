<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/7/22 0022
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
        .tableview  {

            display: table-cell;
            vertical-align: bottom;
            padding-bottom: 5px;
            padding-top: 10px;
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
        }
        .titlelabel
        {
            font-weight:bold;
            font-size: 18px;
            color: rgba(0, 0, 0, 0.6);

        }
    </style>
    <title>功能介绍管理</title>
</head>
<body class="body" >
<p><label class="titlelabel">功能介绍管理</label></p>
<div  style="display:block;position: fixed; text-align:right;margin-top: 10px;">
    <button class="btn" onclick="newFuncOnMouseDown()">新增介绍</button>&nbsp;&nbsp;
    <button class="btn" onclick="updateFuncOnMouseDown()">修改介绍</button>&nbsp;&nbsp;
    <button class="btn" onclick="delFuncOnMouseDown()">删除介绍</button>
</div>
<div>
    <table id="TableView" class="tableview"  style=" margin-top: 60px;  ">
        <thead>
        <tr bgcolor="#34495e" style="color:#FFFFFF;display:block;position: fixed;">
            <th width="50px">ID</th>  <th width="200px">功能名称</th> <th width="200px">功能标题</th>   <th width="500px">功能描述</th>
        </tr>
        </thead>
        <tbody id="tableBody">
        <tr bgcolor="#ffffff" onclick="trOnMouseDown(this)">
            <td>292</td>  <td>特别的测试</td>  <td>3</td>  <td>4</td>
        </tr>
        <c:forEach  items="${tFuncList}" var="tFunc">
            <tr bgcolor="#ffffff" onclick="trOnMouseDown(this)">
                <td>${tFunc.id}</td>  <td>${tFunc.funcName}</td>  <td>${tFunc.funcTitle}</td>  <td>${tFunc.funcDesc}</td>
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
    function newFuncOnMouseDown(){
        window.location.href="${pageContext.request.contextPath}/function/newFunc.cfg";
    }
    function updateFuncOnMouseDown(){
        if(lastTr==null)
        {
            alert("请选择要修改的介绍内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/function/updateFunc.cfg?func_Id="+lastTr.cells[0].innerHTML;
    }
    function delFuncOnMouseDown(){
        if(lastTr==null)
        {
            alert("请选择要删除的内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/function/delFunc.cfg?id="+lastTr.cells[0].innerHTML;

    }
</SCRIPT>
</html>
