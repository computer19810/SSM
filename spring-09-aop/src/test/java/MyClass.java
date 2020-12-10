import com.kuang.pojo.UserService;
import com.kuang.pojo.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userservice = context.getBean("userService", UserService.class);
        userservice.add();
        System.out.println("-----------------------");
        userservice.delete();
        System.out.println("-----------------------");
        userservice.select();
        System.out.println("-----------------------");
        userservice.update();
    }
}
