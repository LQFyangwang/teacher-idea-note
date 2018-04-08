<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/29
  Time: 8:02
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
    <s:debug />
    <form action="<%=path %>/upload/up" method="post" enctype="multipart/form-data">
        <s:actionerror />
        <s:fielderror name="upload" />
        <input type="file" name="upload" />
        <input type="submit" />
    </form>
</body>
</html>
