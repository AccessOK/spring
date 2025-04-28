import org.accessok.config.SpringConfig;
import org.accessok.dao.UserDao;
import org.accessok.service.IUserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class spring3Test {
    @Test
    public void spring3Test() {
        //依赖注入需要从spring容器中获取UserService
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        IUserService userService = ioc.getBean(IUserService.class);
        userService.queryUser();
    }
}
