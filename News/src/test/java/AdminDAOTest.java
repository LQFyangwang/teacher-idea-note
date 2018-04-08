import com.gs.bean.Admin;
import com.gs.common.EncriptUtil;
import com.gs.dao.impl.AdminDAOImpl;

/**
 * Created by Master on 2017/8/2.
 */
public class AdminDAOTest {
    public static void main(String[] args) {
        AdminDAOImpl adminDAO = new AdminDAOImpl();
        Admin admin = adminDAO.queryByPhonePwd("18888888888", EncriptUtil.md5("666"));
        System.out.println(admin);
    }
}
