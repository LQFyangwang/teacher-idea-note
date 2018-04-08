import com.gs.bean.Admin;
import com.gs.bean.ArticleType;
import com.gs.dao.ArticleTypeDAO;
import com.gs.dao.impl.ArticleTypeDAOImpl;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleTypeDAOTest {

    private static ArticleTypeDAO articleTypeDAO = new ArticleTypeDAOImpl();

    public static void testAdd() {
        ArticleType articleType = new ArticleType();
        articleType.setName("国际新闻");
        Admin admin = new Admin();
        admin.setId("8454cb69773011e79e8e80fa5b2e8425");
        articleType.setAdmin(admin);
        articleTypeDAO.add(articleType);
    }

    public static void queryAll() {
        List<ArticleType> articleTypes =  articleTypeDAO.queryAll();
        for (ArticleType type : articleTypes) {
            System.out.println(type);
            System.out.println(type.getAdmin().getPhone());
        }
    }

    public static void main(String[] args) {
        // testAdd();
        queryAll();
    }

}
