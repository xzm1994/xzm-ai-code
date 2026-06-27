package com.xzm.aicode.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppDeployConfig {

    @Value("${server.port:8088}")
    private int serverPort;

    private static int SERVER_PORT;

    @PostConstruct
    public void init() {
        SERVER_PORT = this.serverPort;
    }

    /**
     * 获取应用部署域名
     */
    public static String getDeployHost() {
        return "http://localhost:" + SERVER_PORT;
    }
}
