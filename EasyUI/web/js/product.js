function showAddWin() {
    openWin("addWin");
}

function addProduct() {
    if (formValidate("addForm")) {
        $.post(contextPath + "/product/add",
            $("#addForm").serialize(),
            function(data) {
                if (data.controllerResult.result == "success") {
                    showAlert(data.controllerResult.message);
                    $("#list").datagrid("reload");
                    $("#addForm").form("clear");
                } else {
                    showAlert(data.controllerResult.message);
                }

            }, 'json'
        );
        closeWin("addWin");
    }
}

function showEditWin() {
    var jsonStr = '{"product.id":id_value,"product.name":"name_value","product.quantity":quantity_value,"product.price":price_value}';
    var row = $("#list").datagrid("getSelected"); // 获取数据网格中被选择的单行 getSelections获取数据网格中选中的多行
    if (row) {
        // 选中了行
        jsonStr = jsonStr.replace("id_value", row.id).replace("name_value", row.name).replace("quantity_value", row.quantity).replace("price_value", row.price);
        $("#editForm").form("load", JSON.parse(jsonStr)); // 自动把json对象加载到form表单，form里的name与json数据里的属性保持一致
        openWin("editWin"); // JSON.parse把json字符串转成json对象，JSON.stringify,把JSON对象转成JSON字符串
    } else {
        showAlert("请选择需要修改的商品！");
    }

}

function editProduct() {
    if (formValidate("editForm")) {
        $.post(contextPath + "/product/update",
            $("#editForm").serialize(),
            function(data) {
                if (data.controllerResult.result == "success") {
                    showAlert(data.controllerResult.message);
                    $("#list").datagrid("reload");
                    $("#editForm").form("clear");
                } else {
                    showAlert(data.controllerResult.message);
                }

            }, 'json'
        );
        closeWin("editWin");
    }
}

function valid(status) {
    var row = $("#list").datagrid("getSelected");
    if (row) {
        if (row.status == status) {
            showAlert("无需" + (status == 'y' ? "激活" : "冻结") + "该商品！");
            return;
        }
        var json;
        if (status == 'y') {
            // 激活
            json = {
                "status": "y",
                "id": row.id
            }
        } else if (status == 'n') {
            // 冻结
            json = {
                "status": "n",
                "id": row.id
            }
        }
        $.post(contextPath + "/product/valid",
            json,
            function (data) {
                if (data.controllerResult.result == "success") {
                    showAlert(data.controllerResult.message);
                    $("#list").datagrid("reload");
                } else {
                    showAlert(data.controllerResult.message);
                }
            }, "json"
        );
    } else {
        showAlert("请选择需要" + (status == 'y' ? "激活" : "冻结") + "的商品！");
    }
}