<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/23
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="/servlet/ser" method="post">
        <input type="text" name="name" />
        <input type="password" name="pwd" />
        <input type="checkbox" name="hobby" value="reading"/>阅读
        <input type="checkbox" name="hobby" value="running"/>长跑
        <input type="submit" />
    </form>
</body>
</html>
