<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/30
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <s:iterator value="#request.devices" var="device">
        <s:property value="#device.name" />
        <s:property value="#device.price" />
        <br />
    </s:iterator>
</head>
<body>

</body>
</html>
