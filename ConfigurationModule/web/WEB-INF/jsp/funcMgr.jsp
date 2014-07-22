<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/7/22 0022
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
    <title>无标题文档</title>
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

    </style>
</head>
<body class="body">
<div  style="text-align:left;margin:10px;margin-left:540px">
    <button class="btn" onclick="newFuncOnMouseDown()">新增介绍</button>&nbsp;&nbsp;<button class="btn" onclick="updateFuncOnMouseDown()">修改介绍</button>&nbsp;&nbsp;<button class="btn">删除介绍</button>
</div>
<div>
<div>
    <table id="TableView" class="tableview" >
        <thead>
        <tr bgcolor="#adff2f">
            <th width="180px">ID</th>  <th width="200px">功能名称</th> <th width="200px">功能标题</th>   <th width="500px">功能描述</th>
        </tr>
        </thead>
        <tbody id="tableBody">
        <tr bgcolor="#fff8dc" onclick="trOnMouseDown(this)">
            <td>292</td>  <td>特别的测试</td>  <td>3</td>  <td>4</td>
        </tr>
        <%for(int i=0;i<10;i++){%>
            <tr bgcolor="#fff8dc" onclick="trOnMouseDown(this)">
            <td>1</td>  <td>测试测试呀</td>  <td>3</td>  <td>4</td>
            </tr>
        <% } %>
        </tbody>
    </table>
</div>
</div>
</body>
<SCRIPT LANGUAGE="JavaScript">
    var lastTr=null;
    function trOnMouseDown(obj){
        if(lastTr!=null)
        {
            lastTr.bgColor="#fff8dc";
        }
        if(obj.bgColor=="#fff8dc")
            obj.bgColor="#00ff7f";
        lastTr = obj;

    }
    function newFuncOnMouseDown()
    {
        window.location.href="newFunc.cfg";
    }
    function updateFuncOnMouseDown()
    {
        if(lastTr==null)
        {
            alert("请选择要修改的介绍内容");
            return;
        }
        window.location.href="updateFunc.cfg?func_Id="+lastTr.cells[0].innerHTML;
    }
</SCRIPT>

</html>
