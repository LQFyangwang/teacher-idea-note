import com.gs.bean.Customer;
import com.gs.bean.Product;
import com.gs.servicetest.TestService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Master on 2017/8/4.
 */
public class SpringTest {

    public static void main(String[] args) {
        // spring提供的从src目录下去读取spring配置文件的类，读取到配置文件后生成Spring的上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
        String[] books = customer.getBooks();
        for (String b : books) {
            System.out.println(b + "****");
        }
        List<String> hobbies = customer.getHobbies();
        for (String h : hobbies) {
            System.out.println(h + "****");
        }
        Map<String, String> map = customer.getValues();
        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));
        Properties props = customer.getProps();
        System.out.println(props.getProperty("key1"));
        Customer customer1 = (Customer) context.getBean("customer1");
        System.out.println(customer1);
        Product product = (Product) context.getBean("product");
        System.out.println(product);

        System.out.println("servicetest and daotest test...");
        TestService testService = (TestService) context.getBean("testService");
        testService.test();
    }
    @Test
    public void  addd(){
        System.out.println("输出");
    }
}
