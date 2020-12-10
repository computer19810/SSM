import com.kuang.pojo.student;
import com.kuang.pojo.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans03.xml");
        student student = context.getBean("student", com.kuang.pojo.student.class);
        System.out.println(student.toString());
    }
}
