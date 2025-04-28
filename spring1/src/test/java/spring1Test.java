import org.accessok.service.IUserService;
import org.accessok.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring1Test {

    //在不使用spring的情况下
    @Test
    public void queryUser1() {
      IUserService service = new UserServiceImpl();
      service.queryUser();
    }
    //使用spring1的方法
    @Test
    public void queryUser2() {
        //从spring的容器中获取userService的bean
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserService service=ioc.getBean(IUserService.class);
        service.queryUser();
    }
}
