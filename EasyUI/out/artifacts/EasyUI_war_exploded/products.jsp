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

<table id="list" class="easyui-datagrid"
       data-options="
        singleSelect:true,
        collapsible:true,
        rownumbers:true,
        pagination:true,
        pageSize:20,
        toolbar:'#tb',
        url:'<%=path %>/product/pager',
        method:'get'">
    <thead>
    <tr>
        <th data-options="field:'id',width:80,checkbox:true">编号</th>
        <th data-options="field:'name',width:100">名称</th>
        <th data-options="field:'quantity',width:80,align:'right'">数量</th>
        <th data-options="field:'price',width:80,align:'right'">进价</th>
        <th data-options="field:'salePrice',width:80,align:'right'">销售价</th>
        <th data-options="field:'stockDate',width:250,formatter:formatDate">入库时间</th>
        <th data-options="field:'status',width:60,align:'center',formatter:formatStatus">是否上架</th>
    </tr>
    </thead>
</table>

<div id="tb">
    <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-add" onclick="showAddWin();">添加</a>
    <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-edit" onclick="showEditWin();">编辑</a>
    <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-remove" onclick="valid('y');">激活</a>
    <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-remove" onclick="valid('n');">冻结</a>
</div>

<div id="addWin" class="easyui-window normal-win" title="添加商品" data-options="closed:true">
    <form id="addForm">
        <table>
            <tr>
                <td><label>名称</label></td>
                <td>
                    <input class="easyui-textbox easyui-validatebox" data-options="prompt:'请输入商品名称',required:true,validType:'length[2,20]',novalidate:true" name="product.name" />
                </td>
            </tr>

            <tr>
                <td><label>数量</label></td>
                <td>
                    <input class="easyui-numberbox easyui-validatebox" data-options="prompt:'请输入商品数量',required:true,min:1,max:1000,novalidate:true" name="product.quantity" />
                </td>
            </tr>
            <tr>
                <td><label>价格</label></td>
                <td>
                    <input class="easyui-numberbox easyui-validatebox" data-options="prompt:'请输入商品价格',novalidate:true,precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'$'" name="product.price" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="addProduct()">添加</a></td>
            </tr>
        </table>
    </form>
</div>

<div id="editWin" class="easyui-window normal-win" title="修改商品" data-options="closed:true">
    <form id="editForm">
        <input type="hidden" name="product.id" />
        <table>
            <tr>
                <td><label>名称</label></td>
                <td>
                    <input class="easyui-textbox easyui-validatebox" data-options="prompt:'请输入商品名称',required:true,validType:'length[2,20]',novalidate:true" name="product.name" />
                </td>
            </tr>

            <tr>
                <td><label>数量</label></td>
                <td>
                    <input class="easyui-numberbox easyui-validatebox" data-options="prompt:'请输入商品数量',required:true,min:1,max:1000,novalidate:true" name="product.quantity" />
                </td>
            </tr>
            <tr>
                <td><label>价格</label></td>
                <td>
                    <input class="easyui-numberbox easyui-validatebox" data-options="prompt:'请输入商品价格',novalidate:true,precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'$'" name="product.price" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="editProduct()">修改</a></td>
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
<script>
    $(function () {
        setPagination("list");
    })
</script>
</html>
