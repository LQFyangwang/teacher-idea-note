<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/28
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=path %>/i18n/page?request_locale=zh_CN">中文</a>
<a href="<%=path %>/i18n/page?request_locale=en_US">英文</a>
<s:form action="/form/post" method="post">
    <label><s:text name="name"></s:text></label><!-- 直接通过s:text的方式去获取国际化资源文件中定义的文本内容 -->
    <s:textfield name="name" key="name"/><!-- key与国际化资源文件的key值保持一致 -->
    <s:textarea name="des" label="描述" />
    <s:radio list="#{'Male':'男性', 'Female':'女性'}" label="性别" name="gender"/>
    <s:checkbox value="accept" name="license" label="是否同意" />
    <s:checkboxlist list="#{'running':'跑步', 'reading':'阅读'}" name="hobby" />
    <s:select list="#{'developer':'工程师', 'manager':'经理'}" name="job" />
    <s:submit value="提交" />
    <s:reset value="重置" />
</s:form>
</body>
</html>
