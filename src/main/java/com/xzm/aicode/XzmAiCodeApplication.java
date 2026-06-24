package com.xzm.aicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@MapperScan("com.xzm.aicode.mapper")
public class XzmAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(XzmAiCodeApplication.class, args);
    }

}
