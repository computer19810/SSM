import com.kuang.Damo01.UserServiceImpl;
import com.kuang.Damo01.UserServiceProxy;

public class Mytest {
    public static void main(String[] args) {
        UserServiceImpl userService= new UserServiceImpl();
//        userService.add();
//        userService.delete();
        UserServiceProxy userServiceProxy=new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
        System.out.println("--------------------");
        userServiceProxy.delete();
        System.out.println("----------------------");
        userService.delete();
        System.out.println("----------------------");
    }
}
