function addDevice() {
    $.post("/device/add",
        $("#device").serialize(),
        function (data) {
            if (data.controllerResult.result == 'success') {
                window.location.href = "/device/pager";
            } else {
                alert(data.controllerResult.message);
            }
        },'json'
    );
}