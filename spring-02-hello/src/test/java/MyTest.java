import com.kuang.pojo.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import sun.jvm.hotspot.HelloWorld;

public class MyTest {
    public static void main(String[] args) {

        //获取spring上下文的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //我们的对象都在spring容器里管理了，如果想用，取出来就可以
        hello hello = (hello) context.getBean("hello");
        System.out.println(hello.getStr());
    }
}