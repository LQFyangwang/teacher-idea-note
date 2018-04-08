import com.gs.bean.Admin;
import com.gs.bean.Article;
import com.gs.bean.Comment;
import com.gs.common.bean.Pager;
import com.gs.dao.ArticleDAO;
import com.gs.dao.impl.ArticleDAOImpl;

import java.util.Set;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleDAOTest {

    private static ArticleDAO articleDAO = new ArticleDAOImpl();

    public static void testAdd() {
        Admin admin = new Admin();
        admin.setId("8454cb69773011e79e8e80fa5b2e8425");
        for (int i = 0; i < 20; i++) {
            Article article = new Article();
            article.setTitle("title " + (i + 1));
            article.setContent("content " + (i + 1));
            article.setAdmin(admin);
            articleDAO.add(article);
        }
    }

    public static void testQueryPager() {
        Pager<Article> pager = new Pager<>();
        pager.setPageNo(1);
        pager.setPageSize(5);
        pager = articleDAO.queryByPager(pager);
        System.out.println(pager.getTotal());
        for (Article a : pager.getRows()) {
            System.out.println(a);
            System.out.println(a.getAdmin());
            Set<Comment> comments = a.getComments();
            for (Comment c : comments) {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        // testAdd();
        testQueryPager();
    }

}
