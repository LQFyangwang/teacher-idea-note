import com.gs.bean.Article;
import com.gs.bean.ArticleView;
import com.gs.bean.User;
import com.gs.dao.ArticleViewDAO;
import com.gs.dao.impl.ArticleViewDAOImpl;

import java.util.Calendar;

/**
 * Created by Master on 2017/8/4.
 */
public class ArticleViewDAOTest {
    private static ArticleViewDAO articleViewDAO = new ArticleViewDAOImpl();

    public static void testAdd() {
        ArticleView articleView = new ArticleView();
        articleView.setViewTime(Calendar.getInstance().getTime());
        User user = new User();
        user.setId("402880345da56db8015da56db9210000");
        articleView.setUser(user);
        Article article = new Article();
        article.setId("402880345da1cfad015da1cfaf030000");
        articleView.setArticle(article);
        articleViewDAO.add(articleView);
    }

    public static void main(String[] args) {
        testAdd();
    }

}
