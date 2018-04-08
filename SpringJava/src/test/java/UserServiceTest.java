import com.gs.bean.User;
import com.gs.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest extends TestCase {

    private ClassPathXmlApplicationContext context;

    @Override
    protected void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-user.xml");
    }

    @Test
    public void testSave() {
        UserService userService = (UserService) context.getBean("userService");
        userService.save(new User());
        userService.remove("1");
    }

}
