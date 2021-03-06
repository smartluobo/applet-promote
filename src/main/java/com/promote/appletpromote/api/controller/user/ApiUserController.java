package com.promote.appletpromote.api.controller.user;

import com.promote.appletpromote.cms.service.CmsApiUserService;
import com.promote.appletpromote.entity.TbApiUser;
import com.promote.appletpromote.response.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("api/user")
public class ApiUserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiUserController.class);

    @Resource
    private CmsApiUserService cmsApiUserService;

    /**
     * 登陆接口只获取了用户的openId 该接口小程序前端上报用户的昵称和头像
     * @param params
     * @return
     */
    @RequestMapping("/reportApiUserInfo")
    public ResultInfo reportApiUserInfo(@RequestBody Map<String,String> params){

        if (params == null){
            return ResultInfo.newEmptyParamsResultInfo();
        }
        String openId = params.get("openId");
        String appId = params.get("appId");
        String nickName = params.get("nickName");
        String userHeadImage = params.get("userHeadImage");
        LOGGER.info("reportApiUserInfo current user openId : {}, nickName: {},userHeadImage : {}",openId,nickName,userHeadImage);
        try {
            ResultInfo resultInfo = ResultInfo.newSuccessResultInfo();
            // TODO: 2019/9/28 小程序上报用户的昵称和头像，根据openid更新数据库中的记录 
//            apiUserService.updateApiUserInfo(oppenId,nickName,userHeadImage);
            TbApiUser tbApiUser = new TbApiUser();
            tbApiUser.setOppenId(openId);
            tbApiUser.setNickName(nickName);
            tbApiUser.setUserHeadImage(userHeadImage);
            tbApiUser.setAppid(appId);
            cmsApiUserService.updateByPrimaryKeySelective(tbApiUser);
            return resultInfo;
        }catch (Exception e){
            LOGGER.error("calculateGoodsOrderPrice GoodsOrderParamVo : {}",params,e);
            return ResultInfo.newExceptionResultInfo();
        }
    }
}
