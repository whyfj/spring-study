package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//这个也会被Spring容器托管，注册到容器中，因为他本来就是一个@Conponent
// 代表这是一个配置类，相当于之前的beans.xml
@Configuration
public class MyConfig {

    @Bean//通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    public User getUser(){
        return new User();
    }
}
