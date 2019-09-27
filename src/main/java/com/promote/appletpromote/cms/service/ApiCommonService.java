package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.ApiGames;

import java.util.List;

public interface ApiCommonService {

    List<ApiGames> getAppletByTypeId(Integer id);

}
