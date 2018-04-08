<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/30
  Time: 11:08
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
<form id="device" method="post">
    <input type="text" name="device.name" />
    <input type="text" name="device.price" />
    <input type="datetime" name="device.buyDate"/>
    <input type="button" value="添加" onclick="addDevice();"/>
</form>
<script src="<%=path %>/js/jquery.min.js"></script>
<script src="<%=path %>/js/device.js"></script>
</body>
</html>
