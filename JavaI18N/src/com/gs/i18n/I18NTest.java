package com.gs.i18n;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Master on 2017/6/28.
 */
public class I18NTest {

    public static void main(String[] args) {
        Locale locale = new Locale("en", "US"); // 语言及国家代码的区域对象
        // Locale locale = Locale.getDefault(); // 根据操作系统的区域获取默认的语言及区域代码
        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());
        DateFormat dateFormat = DateFormat.getDateInstance(0, locale);
        System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
        // 根据当前系统 的locale对象获取相应的资源文件，如果locale为中国
        // 第二个参数为当前系统获取的Locale对象，
        // 第一个参数为资源文件的baseName
        // resouce_en_US.properties
        ResourceBundle rb = ResourceBundle.getBundle("resource", locale); // 去获取资源文件
        System.out.println(rb.getString("test"));
    }
}
