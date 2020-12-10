package kuang;

import com.kuang.dao.UserMapper03;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
//import java.util.Map;

public class UserDaoTest {
    @Test
    public void test()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserMapper03 mapper03= sqlSession.getMapper(UserMapper03.class);
//        List<User> userList = mapper03.getUserListUser();
//        for (User user : userList) {
//            System.out.println(user);
//        }
        //User user= mapper03.getUserbyId(1);
        //int i= mapper03.addUser(11,"Hello", "World");
        int i = mapper03.updateUser("Happy New", 5);
        System.out.println(i);
        sqlSession.close();
    }
}
