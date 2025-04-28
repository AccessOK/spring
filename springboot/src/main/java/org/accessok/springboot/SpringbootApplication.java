package org.accessok.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        //当前类当作是一个配置类
        //run方法底层会创建一个spring容器
        ConfigurableApplicationContext ioc=SpringApplication.run(SpringbootApplication.class, args);

    }

}
