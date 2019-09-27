package com.promote.appletpromote.cms.controller.carousel;

import com.promote.appletpromote.cms.service.CmsCarouselService;
import com.promote.appletpromote.entity.TbCarousel;
import com.promote.appletpromote.response.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cmsCarouselController")
public class CmsCarouselController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsCarouselController.class);

    @Resource
    private CmsCarouselService cmsCarouselService;

    @PostMapping("/add")
    private Object add(@RequestBody TbCarousel tbCarousel){
        try {
            LOGGER.info("CmsOwnAppletController  add 获取的插入对象为{}",tbCarousel);
            int add = cmsCarouselService.insertSelective(tbCarousel);
            if(add ==1){
                return ResultInfo.newSuccessResultInfo();
            }
            return ResultInfo.newFailResultInfo();
        }catch (Exception e){
            LOGGER.error("cmsCarouselController add happen exception",e);
            return ResultInfo.newExceptionResultInfo();
        }

    }


    @PostMapping("/del/{id}")
    private Map<String,String> del(@PathVariable("id") Integer id){
        LOGGER.info("CmsOwnAppletController  del 获取的删除的ID{}",id);

        TbCarousel tbCarousel = new TbCarousel();
        int edit = cmsCarouselService.updateByPrimaryKey(tbCarousel);
        if(edit ==1){

        }
        return null;
    }



    @PostMapping("/update/{id}")
    private Map<String,String> update(@RequestBody TbCarousel tbCarousel){
        LOGGER.info("CmsOwnAppletController  update 获取需要修改的参数{}",tbCarousel.toString());
        cmsCarouselService.updateByPrimaryKeySelective(tbCarousel);
        return null;
    }




    @PostMapping("/selectByParam")
    @ResponseBody
    public Map<String,Object> selectByParam(@RequestBody TbCarousel tbCarousel){
        Map<String,Object> result = new HashMap<>();
        LOGGER.info("CmsOwnAppletController  update 获取查询的参数{}",tbCarousel.toString());
        List<TbCarousel> TbCarouselList  = cmsCarouselService.selectByParam(tbCarousel);
        result.put("data",TbCarouselList);
        return result;
    }


    @PostMapping("/selectByPrimaryKey/{id}")
    @ResponseBody
    public Map<String,Object> selectByPrimaryKey(@PathVariable("id") Integer id){
        Map<String,Object> result = new HashMap<>();
        LOGGER.info("CmsOwnAppletController  selectByPrimaryKey 获取查询的参数{}",id);
        TbCarousel tbCarousel  = cmsCarouselService.selectByPrimaryKey(id);
        result.put("data",tbCarousel);
        return result;
    }


}
