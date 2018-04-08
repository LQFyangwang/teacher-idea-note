package com.gs.test;

import com.gs.bean.User;
import com.gs.bean.UserDetail;
import com.gs.dao.UserDetailDAO;
import com.gs.dao.impl.UserDetailDAOImpl;

/**
 * Created by Master on 2017/7/19.
 */
public class UserDetailDAOTest {

    public static void main(String[] args) {
        UserDetailDAO userDetailDAO = new UserDetailDAOImpl();
        UserDetail userDetail = userDetailDAO.queryById(1);
        System.out.println(userDetail);
        System.out.println(userDetail.getUser());

        UserDetail ud = new UserDetail();
        ud.setAddress("gz");
        User u = new User();
        u.setName("gz_name");
        u.setPwd("123");
        ud.setUser(u);
        u.setUserDetail(ud);
        userDetailDAO.add(ud);
        // 从业务逻辑上考虑，一定是先有主键表的数据，
        // 再有外键表的数据，所以级联保存或更新都应该保存主键表对象的时候顺带保存外键表对象
    }
}
