<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/22
  Time: 9:28
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
    <form action="<%=path %>/u/reg" method="post">
        <input type="text" name="phone" placeholder="手机号" />
        <input type="password" name="pwd" placeholder="密码" />
        <input type="checkbox" name="hobby" value="reading"/>阅读
        <input type="checkbox" name="hobby" value="running"/>跑步
        <input type="submit"/>
    </form>
</body>
</html>
