package com.gs.converter;

import com.gs.bean.Point;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by Master on 2017/6/23.
 */
public class MyDataConverter extends StrutsTypeConverter {
    /**
     * from String
     * 从页面获取值转化成目标类型
     * @param map
     * @param strings
     * @param aClass
     * @return
     */
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        if (strings != null && strings.length == 1) {
            int x = Integer.valueOf(strings[0].split(",")[0]);
            int y = Integer.valueOf(strings[0].split(",")[1]);
            if (aClass == Point.class) {
                Point p = new Point();
                p.setX(x);
                p.setY(y);
                return p;
            }
        }
        return null;
    }

    /**
     * 转成字符串对象
     * @param map
     * @param o
     * @return
     */
    public String convertToString(Map map, Object o) {
        if (o.getClass() == Point.class) {
            Point p = (Point) o;
            return p.getX() + "," + p.getY();
        }
        return null;
    }

    @Override
    public Object convertValue(Object value, Class toType) {
        if (Point.class == toType) {
            String[] strings = (String[]) value;
            int x = Integer.valueOf(strings[0].split(",")[0]);
            int y = Integer.valueOf(strings[0].split(",")[1]);
            Point p = new Point();
            p.setX(x);
            p.setY(y);
            return p;
        } else {
            Point p = (Point) value;
            return p.getX() + "," + p.getY();
        }
    }
}
