package com.promote.appletpromote.api.controller.login;

import com.promote.appletpromote.api.service.login.ApiLoginService;
import com.promote.appletpromote.cms.service.CmsApiUserService;
import com.promote.appletpromote.entity.TbApiUser;
import com.promote.appletpromote.response.ResultInfo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("api/user")
public class ApiLoginController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiLoginController.class);

    @Resource
    private ApiLoginService apiLoginService;

    @Resource
    private CmsApiUserService cmsApiUserService;


    @RequestMapping("/login")
    public ResultInfo login(@RequestBody Map<String,String> codeParam){
        LOGGER.info("api user login call.....");
        String code = null;
        String appid = null;
        try {
            if (CollectionUtils.isEmpty(codeParam)){
                return ResultInfo.newEmptyResultInfo();
            }
            code = codeParam.get("code");
            appid = codeParam.get("appId");
            if (StringUtils.isEmpty(code)&&StringUtils.isEmpty(appid)){
                return ResultInfo.newEmptyResultInfo();
            }
            ResultInfo resultInfo = ResultInfo.newSuccessResultInfo();
            String oppenId = apiLoginService.login(code,appid);
            if (StringUtils.isNotEmpty(oppenId)){
                // TODO: 2019/9/28 该openId 为微信用户openId 使用该openId组装一个user对象插入表，返回openId给前端
               // apiUserService.saveApiUser(oppenId);
                TbApiUser tbApiUser = new TbApiUser();
                tbApiUser.setOppenId(oppenId);
                tbApiUser.setAppid(appid);
                LOGGER.error("login add the openid of users {}",tbApiUser.toString());
                cmsApiUserService.insert(tbApiUser);
            }
            resultInfo.setData(oppenId);
            return resultInfo;
        }catch (Exception e){
            LOGGER.error("login happen exception code : {}",code,e);
            return ResultInfo.newExceptionResultInfo();
        }
    }
}
