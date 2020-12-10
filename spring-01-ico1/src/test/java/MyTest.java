import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.dao.UserDaoSQLServerImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
       // UserServiceImpl userService = new UserServiceImpl();
        // userService.setUserDao(new UserDaoSQLServerImpl());
        //userService.getUser();
        ApplicationContext context = new ClassPathXmlApplicationContext("Daobeans.xml");
        UserService userDao = (UserService) context.getBean("DaoSevice");
        userDao.getUser();
    }
}
