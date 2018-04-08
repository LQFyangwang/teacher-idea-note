import com.gs.aop.UserTest;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {

    @Test
    public void testUser() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =new ClassPathXmlApplicationContext("spring-aop.xml");
        UserTest userTest = (UserTest) classPathXmlApplicationContext.getBean("userTest");
        userTest.save();
    }

}
