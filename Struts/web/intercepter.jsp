<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/26
  Time: 14:31
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
    <form action="<%=path %>/intercepter/in" method="post">
        <input type="text" name="test" />
        <input type="text" name="test1" />
        <input type="submit" />
    </form>
</body>
</html>
