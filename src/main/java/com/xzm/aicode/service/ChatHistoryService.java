package com.xzm.aicode.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzm.aicode.model.dto.chathistory.ChatHistoryQueryRequest;
import com.xzm.aicode.model.entity.ChatHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xzm.aicode.model.entity.User;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;

import java.time.LocalDateTime;

/**
* @author Administrator
* @description 针对表【chat_history(对话历史)】的数据库操作Service
* @createDate 2026-06-28 09:09:06
*/
public interface ChatHistoryService extends IService<ChatHistory> {
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);

    boolean deleteByAppId(Long appId);

    QueryWrapper<ChatHistory> getQueryWrapper(ChatHistoryQueryRequest chatHistoryQueryRequest);

    Page<ChatHistory> listAppChatHistoryByPage(Long appId, int pageSize,
                                               LocalDateTime lastCreateTime,
                                               User loginUser);

    int loadChatHistoryToMemory(Long appId, MessageWindowChatMemory chatMemory, int maxCount);
}
