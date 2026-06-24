package com.xzm.aicode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @ClassName: {@link HealthController}
 * @Author: XZM
 * @Date: 2026/6/24 20:06
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/health")
public class HealthController {
    @RequestMapping("/check")
    public String check() {
        return "success";
    }
}
