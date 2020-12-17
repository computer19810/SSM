import com.kuang.dao.UserDaoMapper;
import com.kuang.pojo.User;
import com.kuang.pojo.UserDaoImpl;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SprintMybatisTest {
 //   @Test
//    public void SprintMybatisTest()
//    {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserDaoMapper mapper = sqlSession.getMapper(UserDaoMapper.class);
//        List<User> allUsers = mapper.getAllUser();
//        for (User allUser : allUsers) {
//            System.out.println(allUser);
//        }
//    }
    @Test
    public void SprintTest()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoMapper mapper = context.getBean("userMapper", UserDaoMapper.class);
        List<User> allUser = mapper.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }
    @Test
    public void SpringTest2()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoMapper userMapper2 = context.getBean("userMapper2", UserDaoMapper.class);
        List<User> allUser = userMapper2.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }
}
