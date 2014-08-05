<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/4 0004
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="http://cdn.bootcss.com/twitter-bootstrap/2.2.2/css/bootstrap.min.css" rel="stylesheet">
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
            font-weight:bold;
            color: rgba(0, 0, 0, 0.6);
        }
        .scrollTable {
            max-height: 550px;;
            overflow-x: hidden;
            overflow-y: auto;
            max-width: 860px;
            word-wrap:break-word;

        }

    </style>
    <title>加盟申请管理</title>
</head>
<body class="body">
<p><label class="titlelabel">加盟申请管理</label></p>
<div style="position: fixed; text-align:right;margin-top: 10px;">
    <button class="btn" >导出Excel</button>&nbsp;&nbsp;
    <button class="btn" onclick="CheckOnMouseDown()">确认审核</button>&nbsp;&nbsp;
    <button class="btn" onclick="delOnMouseDown()">清除记录</button>&nbsp;&nbsp;
</div>
<div style="height:400px;">
    <table  style=" margin-top: 60px;min-width:860px; "  >
        <tr bgcolor="#34495e" style="color:#FFFFFF; margin-left:4px;">
            <th width="33px">ID</th>
            <th width="151px">公司名称</th>
            <th width="101px">联系人</th>
            <th width="101px">联系电话</th>
            <th width="171px">E-Mail</th>
            <th width="201px">联系地址</th>
            <th width="151px">申请时间</th>
            <th width="151px">审核</th>
        </tr>
        <td colspan="6">
            <div class="scrollTable">
                <table border="1"  style="border-color:#dcdcdc; position: fixed;min-width:860px; ">
                    <tr class="trStyle"  bgcolor="#ffffff"  onclick="trOnMouseDown(this)">
                    <td width="30px">1</td>
                    <td style="text-align:center;" width="150px">福州飞迈软件有限公司</td>
                    <td style="text-align:center;" width="100px">陈炳树</td>
                    <td style="text-align:center;" width="100px">18564599521</td>
                    <td style="text-align:center;" width="170px">964896101@qq.com</td>
                    <td width="200px">福建师范大学旗山校区生活南区兰苑9-1#502</td>
                    <td width="150px">2014-8-4 14:37:52</td>
                    <th width="151px"><span style="color:green;">已审核</span></th>
                    </tr>
                    <tr class="trStyle"  bgcolor="#ffffff"  onclick="trOnMouseDown(this)">
                        <td width="30px">1</td>
                        <td style="text-align:center;" width="150px">福州飞迈软件有限公司</td>
                        <td style="text-align:center;" width="100px">郑宏伟</td>
                        <td style="text-align:center;" width="100px">18564599521</td>
                        <td style="text-align:center;" width="170px">964896101@qq.com</td>
                        <td width="200px">福建师范大学旗山校区生活南区兰苑9-1#502</td>
                        <td width="150px">2014-8-4 14:37:52</td>
                        <th width="151px"><span style="color:red;">未审核</span></th>
                    </tr>
                    <c:forEach  items="${cooperationList}" var="cooperation">
                        <tr class="trStyle" bgcolor="#ffffff"  onclick="trOnMouseDown(this)">
                            <td width="30px">${cooperation.id}</td>
                            <td style="text-align:center;" width="150px">${cooperation.companyName}</td>
                            <td style="text-align:center;" width="100px">${cooperation.address}</td>
                            <td style="text-align:center;" width="100px">${cooperation.contacter}</td>
                            <td style="text-align:center;" width="170px">${cooperation.email}</td>
                            <td width="200px">${cooperation.phone}</td>
                            <td width="150px">${cooperation.time}</td>
                            <th width="151px"><span style="color:red;">${cooperation.check}</span></th>
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

    function CheckOnMouseDown(){
        if(lastTr==null)
        {
            alert("请选择要修改的介绍内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/cooperation/updateCooperationDo.cfg?id="+lastTr.cells[0].innerText;
    }
    function delOnMouseDown(){
        if(lastTr==null)
        {
            alert("请选择要删除的内容");
            return;
        }
        window.location.href="${pageContext.request.contextPath}/cooperation/delCooperationDo.cfg?id="+lastTr.cells[0].innerText;

    }
</script>
</html>
