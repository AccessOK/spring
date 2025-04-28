import org.accessok.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring2Test {

    @Test
    public void queryUser() {
        //从spring的容器中获取userService的bean
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserService service=ioc.getBean(IUserService.class);
        service.getUser();
    }
}
