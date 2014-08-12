<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <meta content="IE=7" http-equiv="X-UA-Compatible" />
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/microMarketiong.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/css/bootstrap/js/jQuery1.11.1.js"></script>
    <script type="text/javascript">
        function validatemobile(mobile)
        {
            with (mobile) {
                var temp = value;
                if (temp.length != 11) {
                    return false;
                }
                var myreg = /^1\d{10}$/;
                if (!myreg.test(temp)) {
                    return false;
                }
            }
            return true;
        }
        function validatePhone(phone)
        {
            with (phone)
            {
                var temp = value;
                var re = /^0\d{2,3}-?\d{7,8}$/;
                if(re.test(temp)){
                    return true;
                }else{
                    return false;
                }
            }

        }
        function validate(filed,msg)
        {
            with (filed)
            {
                if(value  == null || value == "")
                {
                    alert(msg);
                    return false;
                }
                else
                    return true;
            }
        }
        function validate_email(field,alerttxt)
        {
            with (field)
            {
                apos=value.indexOf("@")
                dotpos=value.lastIndexOf(".")
                if (apos<1||dotpos-apos<2)
                {alert(alerttxt);return false}
                else {return true}
            }
        }
        function submitForm(form)
        {
            with (form)
            {
                if(!validate(companyName,"请输入公司名称"))
                {
                    companyName.focus();
                    return false;
                }
                if(!validate(companyAddr,"请输入公司地址"))
                {
                    companyAddr.focus();
                    return false;
                }
                if(!validate(contacter,"请输入联系人姓名"))
                {
                    contacter.focus();
                    return false;
                }
                if(!validate(email,"请输入电子邮箱"))
                {
                    email.focus();
                    return false;
                }
                else
                    if(!validate_email(email,"请输入正确的邮箱地址"))
                    {
                        email.focus();
                        return false;
                    }
                if(!validate(phone,"请输入联系方式"))
                {
                    phone.focus();
                    return false;
                }
                else
                    if(!validatemobile(phone) && !validatePhone(phone))
                    {
                        alert("请输入正确的联系方式");
                        {
                            phone.focus();
                            return false;
                        }
                    }
            }
        }
    </script>
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
    <div style="width: 100%;">&nbsp;</div>
    <center>
        <div style="width: 920px;">
            <ul>
                <c:forEach items="${merchantList}" var="merchant">
                <li class="item">
                    <div>
                        <img src="${pageContext.request.contextPath}${merchant.merchantPicUrl}" class="item-img">
                        <div class="item-title">
                            <p class="item-title-p"><strong>${merchant.merchantName}</strong></p>
                        </div>
                        <div class="item-text">
                            <p class="item-text-p">${merchant.merchantDesc}</p>
                        </div>
                    </div>
                </li>
                </c:forEach>
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
                 <form action="applyRequest.do" method="post" onsubmit="return submitForm(this);">
                    <div style="margin-top: 5px;">
                        <label class="bottom-label">公司名称：<input type="text" name="companyName" class="input-text"></label>
                    </div>
                    <div style="margin-top: 5px;">
                        <label class="bottom-label">公司地址：<input type="text" name="companyAddress" class="input-text"></label>
                    </div>
                    <div style="margin-top: 5px;">
                        <label class="bottom-label" style="margin-left: 14px;">联系人：<input type="text" name="contacter" class="input-text"></label>
                    </div>
                    <div style="margin-top: 5px;">
                        <label class="bottom-label">常用邮箱：<input type="text" name="email" class="input-text"></label>
                    </div>
                    <div style="margin-top: 5px;">
                        <label class="bottom-label">联系方式：<input type="text" name="phone" class="input-text"></label>
                    </div>
                    <center>
                    <input type="submit" value="提交申请" class="bottom-button">
                    </center>
                </form>
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
<div style="width: 100%;height: 20px;line-height: 20px;min-height: 20px;">
    <p>&nbsp;</p>
</div>
<%--页脚--%>
<div style="min-width: 1024;width: 100%;overflow:hidden;">
    <center>
        <jsp:include page="/common/footer.do"/>
    </center>
</div>
</body>
</html>
