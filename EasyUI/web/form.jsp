<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/7/5
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <link href="<%=path %>/plugins/easyui/themes/default/easyui.css" rel="stylesheet"/>
    <link href="<%=path %>/plugins/easyui/themes/icon.css" rel="stylesheet"/>
    <link href="<%=path %>/css/main.css" rel="stylesheet" />
</head>
<body>
所有商品

<div id="addWin" class="easyui-window large-win" title="编辑商品" data-options="closed:true">
    <form id="addProduct">
        <table>
            <tr>
                <td><label for="name">名称</label></td>
                <td>
                    <input id="name" class="easyui-textbox easyui-validatebox" data-options="prompt:'请输入商品名称',required:true,validType:'length[2,20]',novalidate:true" name="product.name" />
                </td>
            </tr>
            <tr>
                <td><label for="type">类型</label></td>
                <td>
                    <input class="easyui-combobox easyui-validatebox" id="type" name="product.type" data-options="
                    novalidate:true,
                    valueField:'id',
					textField:'text',
                    data:[
                        {'id':'computer','text':'电脑',selected:false},
                        {'id':'cloth','text':'服饰',selected:true}
                    ]"/>
                </td>
            </tr>
            <tr>
                <td><label for="link">淘宝链接</label></td>
                <td>
                    <input id="link" class="easyui-textbox easyui-validatebox" data-options="prompt:'请输入淘宝链接',validType:'url',novalidate:true" name="product.link" />
                </td>
            </tr>
            <tr>
                <td><label for="quantity">数量</label></td>
                <td>
                    <input id="quantity" class="easyui-numberbox easyui-validatebox" data-options="prompt:'请输入商品数量',required:true,min:1,max:1000,novalidate:true" name="product.quantity" />
                </td>
            </tr>
            <tr>
                <td><label for="price">价格</label></td>
                <td>
                    <input id="price" class="easyui-numberbox easyui-validatebox" data-options="prompt:'请输入商品价格',novalidate:true,precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'$'" name="product.price" />
                </td>
            </tr>
            <tr>
                <td><label for="pdate">生产日期</label></td>
                <td>
                    <input id="pdate" class="easyui-datetimebox easyui-validatebox" data-options="prompt:'请选择出厂日期',novalidate:true,editable:false,formatter:formatDate" name="product.pdate" />
                </td>
            </tr>
            <tr>
                <td><label>折扣时段</label></td>
                <td>
                    <input class="easyui-timespinner easyui-validatebox" name="product.saleBeginTime">
                    <input class="easyui-timespinner easyui-validatebox" name="product.saleEndTime">
                </td>
            </tr>
            <tr>
                <td><label for="pic">图片</label></td>
                <td><input id="pic" class="easyui-filebox" name="product.pic" data-options="prompt:'请选择图片',buttonText:'选择图片'"></td>
            </tr>
            <tr>
                <td><label for="des">描述</label></td>
                <td>
                    <input id="des" class="easyui-textbox normal-textbox easyui-validatebox" style="width:300px;height:100px;" data-options="prompt:'请输入商品描述',multiline:true" name="product.des" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="addProduct()">添加</a></td>
            </tr>
        </table>
    </form>
</div>

</body>

<script src="<%=path %>/plugins/jquery.min.js"></script>
<script src="<%=path %>/plugins/easyui/jquery.easyui.min.js"></script>
<script src="<%=path %>/plugins/easyui/locale/easyui-lang-zh_CN.js"></script>
<script src="<%=path %>/js/site-easyui.js"></script>
<script src="<%=path %>/js/product.js"></script>
</html>
