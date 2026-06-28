package com.xzm.aicode.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzm.aicode.exception.ErrorCode;
import com.xzm.aicode.exception.ThrowUtils;
import com.xzm.aicode.model.entity.ChatHistory;
import com.xzm.aicode.model.enums.ChatHistoryMessageTypeEnum;
import com.xzm.aicode.service.ChatHistoryService;
import com.xzm.aicode.mapper.ChatHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【chat_history(对话历史)】的数据库操作Service实现
* @createDate 2026-06-28 09:09:06
*/
@Service
public class ChatHistoryServiceImpl extends ServiceImpl<ChatHistoryMapper, ChatHistory>
    implements ChatHistoryService{

    @Override
    public boolean addChatMessage(Long appId, String message, String messageType, Long userId) {
        ThrowUtils.throwIf(appId == null || appId <= 0, ErrorCode.PARAMS_ERROR, "应用ID不能为空");
        ThrowUtils.throwIf(StrUtil.isBlank(message), ErrorCode.PARAMS_ERROR, "消息内容不能为空");
        ThrowUtils.throwIf(StrUtil.isBlank(messageType), ErrorCode.PARAMS_ERROR, "消息类型不能为空");
        ThrowUtils.throwIf(userId == null || userId <= 0, ErrorCode.PARAMS_ERROR, "用户ID不能为空");
        // 验证消息类型是否有效
        ChatHistoryMessageTypeEnum messageTypeEnum = ChatHistoryMessageTypeEnum.getEnumByValue(messageType);
        ThrowUtils.throwIf(messageTypeEnum == null, ErrorCode.PARAMS_ERROR, "不支持的消息类型: " + messageType);
        ChatHistory chatHistory = ChatHistory.builder()
                .appId(appId)
                .message(message)
                .messageType(messageType)
                .userId(userId)
                .build();
        return this.save(chatHistory);
    }
}




