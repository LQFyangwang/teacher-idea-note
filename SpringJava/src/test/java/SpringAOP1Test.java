import com.gs.aop.UserTest;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOP1Test {

    @Test
    public void testUser() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =new ClassPathXmlApplicationContext("spring-aop1.xml");
        UserTest userTest = (UserTest) classPathXmlApplicationContext.getBean("userTest");
        userTest.save();
    }

    @Test
    public void  testUser1(){
        UserTest userTest = new UserTest();
        userTest.save();
    }
}
