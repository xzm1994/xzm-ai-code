package com.xzm.aicode.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xzm.aicode.model.dto.app.AppQueryRequest;
import com.xzm.aicode.model.dto.app.AppVO;
import com.xzm.aicode.model.entity.App;

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

}
