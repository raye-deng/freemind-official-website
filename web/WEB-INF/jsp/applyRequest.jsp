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
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jquery-2.0.0.min.js"></script>
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