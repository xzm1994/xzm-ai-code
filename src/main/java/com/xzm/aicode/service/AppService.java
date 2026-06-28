package com.xzm.aicode.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xzm.aicode.model.dto.app.AppQueryRequest;
import com.xzm.aicode.model.dto.app.AppVO;
import com.xzm.aicode.model.entity.App;
import com.xzm.aicode.model.entity.User;
import reactor.core.publisher.Flux;

import java.io.Serializable;
import java.util.List;

/**
* @author Administrator
* @description 针对表【app(应用)】的数据库操作Service
* @createDate 2026-06-28 00:33:14
*/
public interface AppService extends IService<App> {

    AppVO getAppVO(App app);

    QueryWrapper<App> getQueryWrapper(AppQueryRequest appQueryRequest);


    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    String deployApp(Long appId, User loginUser);

    /**
     * 删除应用时关联删除对话历史
     *
     * @param id 应用ID
     * @return 是否成功
     */
    boolean removeById(Serializable id);

}
