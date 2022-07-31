package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Component
@Scope("prototype")
public class User {
    // 相当于配置文件中 <property name="name" value="秦疆"/>
    @Value("kuangshen")
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}
