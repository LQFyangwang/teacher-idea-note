<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 2017/7/3
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>EasyUI</title>
    <link href="<%=path %>/plugins/easyui/themes/default/easyui.css" rel="stylesheet"/>
    <link href="<%=path %>/plugins/easyui/themes/icon.css" rel="stylesheet"/>
    <link href="<%=path %>/css/main.css" rel="stylesheet" />
</head>
<body class="easyui-layout">

    <div id="top" data-options="region:'north'">
        <div id="logo">
            <img src="<%=path %>/images/logo.png" />
        </div>
        <div id="welcome">
            欢迎您：<a href="#">admin@126.com</a>,&nbsp;<a href="#">安全退出</a>
        </div>
    </div>
    <div id="footer" data-options="region:'south',split:true">

    </div>
    <div id="menu" data-options="region:'west',split:true" title="主菜单">
        <div class="easyui-accordion">
            <div title="用户管理" data-options="iconCls:'icon-ok',selected:true">
                <ul>
                    <li><a href="javascript:void(0);" class="site-navi-tab" data-src="<%=path %>/users.jsp">所有用户</a></li>
                </ul>
            </div>
            <div title="商品管理" data-options="iconCls:'icon-help'">
                <ul>
                    <li><a href="javascript:void(0);" class="site-navi-tab" data-src="<%=path %>/products.jsp">所有商品</a></li>
                </ul>
            </div>
            <div title="系统管理" data-options="iconCls:'icon-search'">
                <ul>
                    <li><a href="javascript:void(0);" class="site-navi-tab">所有管理员</a></li>
                    <li><a href="javascript:void(0);" class="site-navi-tab">个人信息</a></li>
                    <li><a href="javascript:void(0);" class="site-navi-tab">修改密码</a></li>
                    <li><a href="javascript:void(0);" class="site-navi-tab" data-src="<%=path %>/form.jsp">表单组件</a></li>
                </ul>
            </div>
            <div title="组织架构" data-options="iconCls:'icon-undo'">
                <ul class="easyui-tree">
                    <li>
                        <span>公司</span>
                        <ul>
                            <li data-options="state:'closed'">
                                <span>总经理办公室</span>
                                <ul>
                                    <li>
                                        <span>总经理</span>
                                    </li>
                                    <li>
                                        <span>副总经理</span>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <span>财务部门</span>
                                <ul>
                                    <li>会计</li>
                                    <li>出纳</li>
                                </ul>
                            </li>
                            <li>
                                <span>研发部门</span>
                                <ul>
                                    <li>项目经理</li>
                                    <li>开发工程师</li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div id="tabs" class="easyui-tabs" data-options="region:'center'">
        <div title="主页">
            <div class="easyui-panel my-panel" title="系统状态" data-options="iconCls:'icon-save',collapsible:true,minimizable:true,maximizable:true,closable:true">
                MySQL:5.7,Tomcat8.5,JDK 1.8, CPU
            </div>
            <div class="easyui-panel my-panel" title="待办任务">
                1、待办任务标题，任务时间&nbsp;&nbsp;
                <a class="easyui-linkbutton" href="javascript:void(0);" onclick="editTaskDetail();" data-options="iconCls:'icon-edit'">编辑详情</a>&nbsp;
                <a class="easyui-linkbutton" href="javascript:void(0);" onclick="viewTaskDetail();" data-options="iconCls:'icon-search'">查看详情</a>&nbsp;
                <a class="easyui-linkbutton" href="javascript:void(0);" onclick="delTaskDetail();" data-options="iconCls:'icon-cut'">删除任务</a>&nbsp;
                <a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#operations',iconCls:'icon-ok'">更多操作</a>
                <br />
                2、待办任务标题，任务时间&nbsp;&nbsp;<a class="easyui-linkbutton" href="javascript:void(0);" onclick="viewTaskDetail();">查看详情</a>
                <br />
                3、待办任务标题，任务时间&nbsp;&nbsp;<a class="easyui-linkbutton" href="javascript:void(0);" onclick="viewTaskDetail();">查看详情</a>
                <br />
                4、待办任务标题，任务时间&nbsp;&nbsp;<a class="easyui-linkbutton" href="javascript:void(0);" onclick="viewTaskDetail();">查看详情</a>
            </div>
            <div class="easyui-panel my-panel" title="报表统计">
                用户量的统计报表
                财务统计报表
            </div>
        </div>
    </div>

    <!-- 选项卡的右键菜单  -->
    <div id="mm" class="easyui-menu">
        <div id="mm-tabupdate">刷新</div>
        <div class="menu-sep"></div><!--分割线 -->
        <div id="mm-tabclose">关闭</div>
        <div id="mm-tabcloseother">关闭其他</div>
        <div id="mm-tabcloseall">关闭全部</div>
    </div>

    <div id="operations">
        <div>任务优先级</div>
        <div class="menu-sep"></div>
        <div>调到最高优先级</div>
        <div>调到最低优秀级</div>
    </div>

    <div id="taskDetail" class="easyui-dialog normal-dlg" title="任务详情" data-options="closed:true,
        buttons: [{
					text:'执行任务',
					iconCls:'icon-ok',
					handler:function(){
						showAlert('执行任务');
						$('#taskDetail').dialog('close');
					}
				},{
					text:'关闭',
					handler:function(){
						$('#taskDetail').dialog('close');
					}
				}]">
        这是任务的详情！！！
    </div>

    <div id="editDetailWin" class="easyui-window normal-win" data-options="title:'编辑任务',closed:true,modal:true">
        编辑任务详情的form表单
    </div>

</body>
<script src="<%=path %>/plugins/jquery.min.js"></script>
<script src="<%=path %>/plugins/easyui/jquery.easyui.min.js"></script>
<script src="<%=path %>/plugins/easyui/locale/easyui-lang-zh_CN.js"></script>
<script src="<%=path %>/js/site-easyui.js"></script>
<script src="<%=path %>/js/home.js"></script>
</html>
