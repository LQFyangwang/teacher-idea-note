<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/6/27
  Time: 8:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug />
    <s:property value="#parameters.name" /> <!--获取请求参数的内容 -->
    ${requestScope.age }<!-- 使用el表达式语言同样可以操作action中放置的属性，属性默认放在request中 -->
    ${requestScope.user.email}

    <s:property value="#request.age" />
    <s:property value="#request.user.email" />
    <s:property value="#attr.email" />
    <br />
    <s:iterator value="{'a','b','c'}" status="status" var="aa">
        <s:property value="#aa" />
    </s:iterator>
    <br />
    <s:iterator value="#{'one':'one_value', 'two':'two_value'}" status="status" var="a">
        <s:property value="#a.key" />
        <s:property value="#a.value" />
    </s:iterator>
    <br />
    <s:iterator value="#request.users" begin="0" end="1" status="status" var="user">
        <s:property value="#status.index" />
        <s:property value="#status.count" />
        <s:property value="#user.email" />
    </s:iterator>

    <s:property value="#request.users[0].email" />

    <!-- 把指定值放入值栈（ValueStack） -->
    <s:push value="'阿拉伯联合酋长国1'">
    </s:push>
    <s:push value="'阿拉伯联合酋长国2'">
        <!-- 阿拉伯联合酋长国2在valueStack的最底部0，所以此时的Action类在1位置，textprodiver在2位置 -->
        <s:property value="[0].top"/>
    </s:push>

    <s:append var="aaa">
        <s:param value="{'中国', '美国', '日本'}"></s:param>
        <s:param value="{'德国', '泰国', '新加坡'}"></s:param>
    </s:append>
    <s:iterator value="#aaa" var="test">
        <s:property value="#test" />
    </s:iterator>

    <s:date name="#request.users[1].birthday" format="yyyy-MM-dd HH:mm:ss" />

    <s:if test="#request.users[0].gender == 'Ma'">
        男性
    </s:if>
    <s:elseif test="#reqeust.user.gender == 'Female'">
        女性
    </s:elseif>
    <s:else>其他</s:else>

    <s:generator separator="," val="'string1,string2,string3'" var="sArray">
        <s:iterator>
            <s:property /><br />
        </s:iterator>
    </s:generator>


    <s:include value="error.jsp" />
    <s:url value="error.jsp" />
    <s:set value="5" var="test" />
    <s:property value="#test" />
    <br />
    <s:subset source="{1,2,3}" var="newArray" start="1" count="2">
        <s:iterator>
            <s:property />&nbsp;
        </s:iterator>
    </s:subset>


</body>
</html>
