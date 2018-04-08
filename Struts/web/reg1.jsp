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
    <form action="<%=path %>/uu/reg" method="post">
        <input type="text" name="user.email" placeholder="邮箱" />
        <input type="password" name="user.password" placeholder="密码" />
        <input type="text" name="user.gender" placeholder="性别" />
        <input type="checkbox" name="user.hobby" value="reading"/>阅读
        <input type="checkbox" name="user.hobby" value="running"/>跑步
        <input type="datetime" name="user.birthday" />
        <input type="submit"/>
    </form>
</body>
</html>
