package com.xzm.aicode.controller;

import com.xzm.aicode.common.BaseResponse;
import com.xzm.aicode.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/check")
    public BaseResponse<String> check() {
        return ResultUtils.success("ok");
    }
}
