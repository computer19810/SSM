import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    public static void main(String[] args) {

       ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
       User user = (User) context.getBean("name");
       user.show();
    }
}
