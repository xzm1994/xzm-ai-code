package com.xzm.aicode.service;

import jakarta.servlet.http.HttpServletResponse;

/**
 * @Description: 通用项目下载服务
 * @ClassName: {@link ProjectDownloadService}
 * @Author: XZM
 * @Date: 2026/7/11 8:28
 * @Version: 1.0.0
 */
public interface ProjectDownloadService {

    void downloadProjectAsZip(String projectPath, String downloadFileName, HttpServletResponse response);
}
