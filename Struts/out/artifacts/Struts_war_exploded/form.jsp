<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/28
  Time: 10:47
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
    <s:form action="/form/post" method="post">
        <s:token />
        <s:textfield name="name" label="姓名"/>
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
