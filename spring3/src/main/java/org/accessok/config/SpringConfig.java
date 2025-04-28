package org.accessok.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//这个配置类用来代替xml配置spring扫描的位置
@Configuration //当前类为spring容器配置类
@ComponentScan("org.accessok") //配置容器扫描路径 = <context:component-scan base-package="org.accessok">
public class SpringConfig {
}
