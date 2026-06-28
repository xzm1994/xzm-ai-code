package com.xzm.aicode.service;

import com.xzm.aicode.model.entity.ChatHistory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【chat_history(对话历史)】的数据库操作Service
* @createDate 2026-06-28 09:09:06
*/
public interface ChatHistoryService extends IService<ChatHistory> {
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);
}
