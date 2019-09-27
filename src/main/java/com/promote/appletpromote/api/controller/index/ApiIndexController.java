package com.promote.appletpromote.api.controller.index;


import com.promote.appletpromote.cms.service.ApiCommonService;
import com.promote.appletpromote.cms.service.CmsClientAppletService;
import com.promote.appletpromote.cms.service.CmsOwnAppletService;
import com.promote.appletpromote.cms.service.CmsTypesService;
import com.promote.appletpromote.entity.*;
import com.promote.appletpromote.response.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/apiIndex")
public class ApiIndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiIndexController.class);

    @Resource
    private CmsTypesService cmsTypesService;

    @Resource
    private ApiCommonService apiCommonService;


    @GetMapping("/getGameList")
    @ResponseBody
    public Object getGameList(){
        TbTypes tbTypes = new TbTypes();
        List<ApiTypes> typeList = cmsTypesService.getTpyes(tbTypes);
        for (ApiTypes apiType : typeList) {
            List<ApiGames> apiGameList =apiCommonService.getAppletByTypeId(apiType.getId());
            apiType.setApiGameList(apiGameList);
        }
        return typeList;
    }



}
