package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.ApiCommonService;
import com.promote.appletpromote.entity.ApiGames;
import com.promote.appletpromote.mapper.TbApiCommonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ApiCommonServiceImpl implements ApiCommonService {

    @Resource
    private TbApiCommonMapper tbApiCommonMapper;


    @Override
    public List<ApiGames> getAppletByTypeId(Integer id) {
        return tbApiCommonMapper.getAppletByTypeId(id);
    }
}
