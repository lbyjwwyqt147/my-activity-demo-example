package com.activity.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/***
 *  exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class, SecurityAutoConfiguration.class} 解决　启动时出现　 java.lang.ArrayStoreException: sun.reflect.annotation.TypeNotPresentExceptionProxy
 */
@SpringBootApplication(exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class, SecurityAutoConfiguration.class})
public class MyActivityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyActivityDemoApplication.class, args);
    }
}
