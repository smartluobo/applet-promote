package com.promote.appletpromote.cms.controller.ownApplet;

import com.promote.appletpromote.cms.service.CmsOwnAppletService;
import com.promote.appletpromote.entity.TbOwnApplet;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cmsOwnAppletController")
public class CmsOwnAppletController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsOwnAppletController.class);

    @Resource
    private CmsOwnAppletService cmsOwnAppletService;


    @PostMapping("/add")
    private Map<String,String> add(@RequestBody TbOwnApplet tbOwnApplet){

        LOGGER.info("CmsOwnAppletController  add 获取的插入对象为{}",tbOwnApplet);

        int add = cmsOwnAppletService.insertSelective(tbOwnApplet);
        if(add ==1){

        }
        return null;
    }


    @PostMapping("/del/{id}")
    private Map<String,String> del(@PathVariable("id") Integer id){
        LOGGER.info("CmsOwnAppletController  del 获取的删除的ID{}",id);

        TbOwnApplet tbOwnApplet = new TbOwnApplet();
        tbOwnApplet.setIsDel(1);
        tbOwnApplet.setId(id);
        int edit = cmsOwnAppletService.updateByPrimaryKey(tbOwnApplet);
        if(edit ==1){

        }
        return null;
    }



    @PostMapping("/update/{id}")
    private Map<String,String> update(@RequestBody TbOwnApplet tbOwnApplet){
        LOGGER.info("CmsOwnAppletController  update 获取需要修改的参数{}",tbOwnApplet.toString());
        cmsOwnAppletService.updateByPrimaryKeySelective(tbOwnApplet);
        return null;
    }




    @PostMapping("/selectByParam")
    @ResponseBody
    public Map<String,Object> selectByParam(@RequestBody TbOwnApplet tbOwnApplet){
        Map<String,Object> result = new HashMap<>();
        LOGGER.info("CmsOwnAppletController  update 获取查询的参数{}",tbOwnApplet.toString());
        tbOwnApplet.setIsDel(0);
        List<TbOwnApplet> tbOwnAppletList  = cmsOwnAppletService.selectByParam(tbOwnApplet);
        result.put("data",tbOwnAppletList);
        return result;
    }


    @PostMapping("/selectByPrimaryKey/{id}")
    @ResponseBody
    public Map<String,Object> selectByPrimaryKey(@PathVariable("id") Integer id){
        Map<String,Object> result = new HashMap<>();
        LOGGER.info("CmsOwnAppletController  selectByPrimaryKey 获取查询的参数{}",id);
        TbOwnApplet tbOwnApplet  = cmsOwnAppletService.selectByPrimaryKey(id);
        result.put("data",tbOwnApplet);
        return result;
    }


}
