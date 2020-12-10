import com.kuang.Cat;
import com.kuang.Dog;
import com.kuang.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Person person = context.getBean("person", Person.class);
        person.getCat().shut();
        person.getDog().shut();
        System.out.println(person.getName());
    }

}
