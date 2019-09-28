package com.promote.appletpromote.api.controller.index;


import com.promote.appletpromote.cms.controller.user.CmsUserController;
import com.promote.appletpromote.cms.service.ApiCommonService;
import com.promote.appletpromote.cms.service.CmsPvClickService;
import com.promote.appletpromote.cms.service.CmsTypesService;
import com.promote.appletpromote.cms.service.CmsUvClickService;
import com.promote.appletpromote.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/apiIndex")
public class ApiIndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiIndexController.class);

    @Resource
    private CmsTypesService cmsTypesService;

    @Resource
    private ApiCommonService apiCommonService;

    @Resource
    private CmsPvClickService cmsPvClickService;

    @Resource
    private CmsUvClickService cmsUvClickService;






    //获取小程序的游戏列表
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




    //添加小程序的uv跟pv，以及授权之后的新增用户
    @GetMapping("/addPvAndUv")
    @ResponseBody
    public Object addPvAndUv(){






        return null;
    }



    //添加小程序的uv跟pv，以及授权之后的新增用户
    @GetMapping("/addUserInfo")
    @ResponseBody
    public Object addUserInfo(){




        return null;
    }




}
