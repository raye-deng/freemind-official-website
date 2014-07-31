<%--
  Created by IntelliJ IDEA.
  User: 邓风森
  Date: 2014/7/22
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>微领域-招商加盟</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/microMarketiong.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jquery-2.0.0.min.js"></script>
</head>
<body>
<!--顶部导航-->
<div id="header" style="z-index: 9999;position: fixed;top: 0;left: 0;">
    <jsp:include page="/common/header.do"/>
</div>
<div class="pageContent">
    <div class="head-image">
        <img width="100%" height="150px" src="${pageContext.request.contextPath}/resources/images/microMarketing/join.png">
    </div>
    <div style="width: 100%;">&nbsp;</div>
    <center>
        <div style="width: 1024px;">
            <ul>
                <li class="item">
                    <div>
                        <img src="dasd" class="item-img">
                        <div class="item-title">
                            <p class="item-title-p"><strong>标题</strong></p>
                        </div>
                        <div class="item-text">
                            <p class="item-text-p">&nbsp;&nbsp;&nbsp;&nbsp;详细描述</p>
                        </div>
                    </div>
                </li>

            </ul>
        </div>

    </center>
    <div class="bottom" >
        <dl class="bottom-left">
            <div class="bottom-block">
                <center>
                <div  style="color: #ffffff;margin-bottom: 20px;">
                    <h3>申请成为代理商</h3>
                </div>
                </center>
                <div style="margin-top: 5px;">
                    <label class="bottom-label">公司名称：<input type="text" id="companyName" class="input-text"></label>
                </div>
                <div style="margin-top: 5px;">
                    <label class="bottom-label">公司地址：<input type="text" id="companyAddr" class="input-text"></label>
                </div>
                <div style="margin-top: 5px;">
                    <label class="bottom-label" style="margin-left: 14px;">联系人：<input type="text" id="contact" class="input-text"></label>
                </div>
                <div style="margin-top: 5px;">
                    <label class="bottom-label">常用邮箱：<input type="text" id="email" class="input-text"></label>
                </div>
                <div style="margin-top: 5px;">
                    <label class="bottom-label">联系电话：<input type="text" id="phone" class="input-text"></label>
                </div>
                <center>
                <input type="button" value="提交申请" class="bottom-button">
                </center>
            </div>
        </dl>
        <dl  class="bottom-right">
            <div style="color: #ffffff;margin-left: -20px;">
                <h3>全国加盟热线</h3>
            </div>
            <div style="font-size: 12px;color: #000;">
                <p>林赞赏（先生）：18606023770&nbsp;&nbsp;QQ：23719827</p>
                <p>谢盛源（先生）：13023888638&nbsp;&nbsp;QQ：565073429</p>
                <p>林文斌（先生）：13559128787&nbsp;&nbsp;QQ：2056373006</p>
                <p>林峰兰（女士）：15005915539&nbsp;&nbsp;QQ：2734039460</p>
            </div>
        </dl>
    </div>
</div>

<%--页脚--%>
<div style="min-width: 1024px;width: 100%; background: #292F36;min-height:300px;padding-top:30px;float: left;">
    <center>
        <jsp:include page="/common/footer.do"/>
    </center>
</div>
</body>
</html>
