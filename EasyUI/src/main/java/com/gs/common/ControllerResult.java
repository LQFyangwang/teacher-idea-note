package com.gs.common;

/**
 * Created by Master on 2017/6/30.
 */
public class ControllerResult {

    public static final String  SUCCESS = "success";
    public static final String FAIL = "fail";

    private String result;
    private String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ControllerResult getSuccessResult(String message) {
        ControllerResult controllerResult = new ControllerResult();
        controllerResult.setResult(SUCCESS);
        controllerResult.setMessage(message);
        return controllerResult;
    }

    public static ControllerResult getFailResult(String message) {
        ControllerResult controllerResult = new ControllerResult();
        controllerResult.setResult(FAIL);
        controllerResult.setMessage(message);
        return controllerResult;
    }
}
