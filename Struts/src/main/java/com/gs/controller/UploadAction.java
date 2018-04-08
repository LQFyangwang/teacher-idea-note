package com.gs.controller;

import com.gs.util.FileUtil;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Master on 2017/6/29.
 */
public class UploadAction extends ActionSupport {

    private File upload; // 与form表单中file的name一致，temp文件， ROOT/upload_cc3fa222_9f87_4066_af9b_8b7f07e77389_00000000.tmp
    private String uploadFileName; // 此变量的名称固定为file的name + "FileName"
    private String uploadContentType; // file的name + "contentType"

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String execute() {
        try {
            FileUtils.copyFile(upload, new File(FileUtil.uploadPath() + File.separator + uploadFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(File.separator);
        return SUCCESS;
    }

}
