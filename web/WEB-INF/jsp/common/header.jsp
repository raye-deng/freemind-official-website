<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<title>微领域</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common/dialog.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common/head-style.css">

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common/head-nav.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common/jsAddress.js"></script>
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
                if(!validate(contacter,"请输入联系人姓名"))
                {
                    contacter.focus();
                    return false;
                }
                if(!validate(companyName,"请输入公司名称"))
                {
                    phone.focus();
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

            }
        }
        function initCityCombo(pid){

        }
        function initAreaCombo(pid){

        }
    </script>
</head>
<body onload="setup();preselect('北京市');">
<div id="top_bg">
	<div class="top">
		<a class="logo_l" href=" ${pageContext.request.contextPath}/home.do" title="返回首页"></a>
		<!--导航开始-->
		<div class="nav_z">
        	<center>
			<ul id="navul" class="cl" style="min-width:700px;width:700px;">
                <c:forEach  items="${navList}" var="item">
                    <c:if test="${item.parentId==0}">
                        <li>
                            <c:if test="${item.navUrl=='#'}">
                                <a id="nav${item.id}" style="color: #fff;">${item.navName}</a>
                            </c:if>
                            <c:if test="${item.navUrl!='#'}">
                                <a href="${pageContext.request.contextPath}/${item.navUrl}"  id="nav${item.id}" >${item.navName}</a>
                            </c:if>
                            <ul>
                                <c:forEach  items="${navList}" var="childItem">
                                    <c:if test="${childItem.parentId==item.id}"><li><a href="${childItem.navUrl}" id="nav${childItem.id}" >${childItem.navName}</a></li></c:if>
                                </c:forEach>
                            </ul>
                        </li>
                    </c:if>
                </c:forEach>

                <a href="#" id="example" class="button medium blue" style="font-family: 'huaKanYuanTi'">申请试用</a>
                <a href="http://vzone.freemindsoft.com" class="button medium blue" style="font-family: 'huaKanYuanTi'">登录</a>

                <!--可在此处直接添加导航-->
			</ul>
            </center>
		</div><!--导航结束-->
		<script  type="text/javascript"> 
		$(".navbg").capacityFixed();
		</script>

	</div>
    <center>
        <div id="dialog">

            <div class="row1">
                申请试用<a href="javascript:void(0)" title="关闭窗口" class="close_btn" id="closeBtn">×</a>
            </div>
            <form action="TTrialRequest.do" method="post" onsubmit="return submitForm(this);">
                <div class="row">
                    联&nbsp;系&nbsp;人&nbsp;: <span class="inputBox"><input class="reqText" type="text" name="contacter"/></span>
                </div>
                <div class="row">
                    公司名称: <span class="inputBox"><input class="reqText" type="text" name="companyName"/></span>
                </div>
                <div class="row" style="margin-left: 50px;">
                    省: <span class="inputBox">
                            <select class="reqText" style="width: 120px;" name="province" id="s1">
                                <option></option>
                            </select>
                        </span>
                    市: <span class="inputBox">
                        <select class="reqText" style="width: 120px;" name="city" id="s2">
                                <option></option>
                        </select>
                        </span>
                    区: <span class="inputBox">
                        <select class="reqText" style="width: 120px;" name="town" id="s3">
                            <option></option>
                        </select>
                        </span>
                </div>
                <div class="row">
                    联系电话: <span class="inputBox"><input class="reqText" type="text" name="phone"/></span>
                </div>
                <div class="row">
                    电子邮件: <span class="inputBox"><input class="reqText" type="text" name="email"/></span>
                </div>
                <div class="row">
                    备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注: <span class="inputBox"><input class="reqText" type="text" name="note"/></span>
                </div>
                <div class="row2">
                    <input type="submit" value="确认提交"  id="Btn"/>
                </div>
            </form>
        </div>
    </center>
</div>

</body>
<script>
    function promptinfo()
    {
        var address = document.getElementById('address');
        var s1 = document.getElementById('s1');
        var s2 = document.getElementById('s2');
        var s3 = document.getElementById('s3');
        address.value = s1.value + s2.value + s3.value;
    }
</script>
</html>
