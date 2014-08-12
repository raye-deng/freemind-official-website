<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/8/1
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${msg}</title>
    <meta content="IE=7" http-equiv="X-UA-Compatible" />
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jQuery1.11.1.js"></script>
</head>
<body>

</body>
</html>
<script type="text/javascript">
    $(window).load(showMsg('${msg}'));


    function showMsg(msg){
        alert(msg);
        history.go(-1);
    }
</script>