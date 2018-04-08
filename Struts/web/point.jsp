<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/23
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="/point/p" method="post">
        <s:fielderror fieldName="p" />
        <s:fielderror fieldName="a" />
        <s:fielderror fieldName="pwd" />
        <s:fielderror fieldName="conPwd" />
        <s:fielderror fieldName="phone" />
        <input type="text" name="p" value="1,.,2" />
        <input type="text" name="a" />
        <input type="password" name="pwd" />
        <input type="password" name="conPwd"/>
        <input type="text" name="phone" />
        <input type="submit" />
    </form>
</body>
</html>