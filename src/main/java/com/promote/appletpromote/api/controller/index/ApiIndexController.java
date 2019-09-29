package com.promote.appletpromote.api.controller.index;


import com.promote.appletpromote.cms.service.*;
import com.promote.appletpromote.entity.*;
import com.promote.appletpromote.response.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

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


    @Resource
    private CmsApiUserService cmsApiUserService;

    @Resource
    private CmsClientAppletService cmsClientAppletService;


    @Resource
    private CmsCarouselService cmsCarouselService;

    @Resource
    private CmsBackgroundService cmsBackgroundService;



    //获取小程序的游戏列表
    @PostMapping("/getGameList")
    @ResponseBody
    public Object getGameList(){
        TbTypes tbTypes = new TbTypes();
        List<ApiTypes> typeList = cmsTypesService.getTpyes(tbTypes);
        for (ApiTypes apiType : typeList) {
            List<ApiGames> apiGameList =apiCommonService.getAppletByTypeId(apiType.getId());
            LOGGER.info("**********获取到的apiGameList={}",apiGameList);

            apiType.setApiGameList(apiGameList);
        }
        return typeList;
    }


    //获取盒子详情
    @PostMapping("/getGameDetail")
    @ResponseBody
    public Object getGameDetai(@RequestBody Map<String,String> codeParam){
        Integer id = Integer.valueOf(codeParam.get("id"));
        LOGGER.info("**********获取到的id={}",id);
        ApiGame apiGame = cmsClientAppletService.selectById(id);
        return apiGame;
    }


    //获取小程序首页轮播图
    @PostMapping("/getCarousel")
    @ResponseBody
    public Object getCarousel(@RequestBody Map<String,String> codeParam){
        String appid = codeParam.get("appId");
        LOGGER.info("**********获取到的appid={}",appid);
        List<ApiBannerImg> tbCarousels= cmsCarouselService.getBannerImg(appid);
        return tbCarousels;
    }


    //添加小程序的uv跟pv，以及授权之后的新增用户
    @PostMapping("/addPvAndUv")
    @ResponseBody
    public Object addPvAndUv(@RequestBody ApiSaveUvPv apiSaveUvPv){
        //1.如果status ==0 则代表用户在点击去玩游戏的时候点击了取消，此时则记录pv不记录uv
        if("1".equals(apiSaveUvPv.getStatus())){
        //当客户点击游戏确定按钮，则查询表该用户今天是否已经记录了，如果已经存在则不在插入记录，否则添加该记录
            TbUvClick tbUvClick = new TbUvClick();
            tbUvClick.setCreateTime(new Date());
            tbUvClick.setOpenid(apiSaveUvPv.getOppenid());
            tbUvClick.setAppid(apiSaveUvPv.getClientAppletId());
            List<TbUvClick> tbUvClickList = cmsUvClickService.selectByPrimaryParm(tbUvClick);
            if(tbUvClickList.size()==0){
                tbUvClick.setOwnAppletId(apiSaveUvPv.getOwnAppletId());
                LOGGER.info(tbUvClick.toString());
                cmsUvClickService.insert(tbUvClick);
            }
        }else{
            //
            TbPvClick tbPvClick = new TbPvClick();
            tbPvClick.setAppid(apiSaveUvPv.getOppenid());
            tbPvClick.setCreateTime(new Date());
            tbPvClick.setOwnAppletId(apiSaveUvPv.getOwnAppletId());
            tbPvClick.setClientAppletId(apiSaveUvPv.getClientAppletId());
            int add = cmsPvClickService.insert(tbPvClick);
            if(add ==1){
                return ResultInfo.newSuccessResultInfo();
            }
        }
        return ResultInfo.newSuccessResultInfo();
    }



    //添加小程序的uv跟pv，以及授权之后的新增用户
    @PostMapping("/addUserInfo")
    @ResponseBody
    public Object addUserInfo(@RequestBody TbApiUser tbApiUser){
    try{
        int add = cmsApiUserService.insert(tbApiUser);
        if(add ==1){
            return ResultInfo.newSuccessResultInfo();
        }
    }catch (Exception e){
        LOGGER.error("cmsCarouselController add happen exception",e);
        return ResultInfo.newExceptionResultInfo();
    }
        return ResultInfo.newFailResultInfo();
    }


    @PostMapping("/getBackground")
    public Object getBackground(@RequestBody Map<String,String> codeParam){
        String appId = codeParam.get("appId");
        TbBackground tbBackground = new TbBackground();
        tbBackground.setAppid(appId);
        tbBackground = cmsBackgroundService.selectByPrimaryParam(tbBackground);
        return tbBackground;
    }


    @PostMapping("/getBackgroundImg")
    public String getBackgroundImg(@RequestBody Map<String,String> codeParam){
        String appId = codeParam.get("appId");
        if(StringUtils.isEmpty(appId)){
            appId = "admin";
        }
        TbBackground tbBackground = new TbBackground();
        tbBackground.setAppid(appId);
        tbBackground = cmsBackgroundService.selectByPrimaryParam(tbBackground);
        return tbBackground.getBackground();
    }


    @PostMapping("/getButtom")
    public String getButtom(@RequestBody Map<String,String> codeParam){
        String appId = codeParam.get("appId");
        if(StringUtils.isEmpty(appId)){
            appId = "admin";
        }
        TbBackground tbBackground = new TbBackground();
        tbBackground.setAppid(appId);
        tbBackground = cmsBackgroundService.selectByPrimaryParam(tbBackground);
        LOGGER.error("getButtom add happen exception",tbBackground);
        return tbBackground.getButtom();
    }


}
