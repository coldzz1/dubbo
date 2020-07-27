import com.kele.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer1.xml");

        context.start();

        System.out.println("consumer start");

        DemoService demoService = context.getBean(DemoService.class);

        System.out.println("consumer");

        System.out.println(demoService.getPermissions(1L));
    }
}
