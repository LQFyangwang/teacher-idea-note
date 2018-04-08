package com.gs.util;

import org.apache.struts2.ServletActionContext;

import java.io.File;

/**
 * Created by Master on 2017/6/29.
 */
public class FileUtil {

    public static final String UPLOADS = "uploads";

    /**
     * 获取文件上传的路径
     * @return
     */
    public static String uploadPath() {
        String rootPath = ServletActionContext.getServletContext().getRealPath("/");
        File uploads = new File(rootPath, UPLOADS);
        if (!uploads.exists()) {
            uploads.mkdir();
        }
        return uploads.getAbsolutePath();
    }
}
