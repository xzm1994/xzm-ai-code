package com.xzm.aicode;

import com.xzm.aicode.ai.AiCodeGeneratorService;
import com.xzm.aicode.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void generateHtmlCode() {
        String encryptPassword = userService.getEncryptPassword("123456");
        System.out.println(encryptPassword);
    }

}
