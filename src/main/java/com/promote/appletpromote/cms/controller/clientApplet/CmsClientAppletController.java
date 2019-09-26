package com.promote.appletpromote.cms.controller.clientApplet;

import com.promote.appletpromote.cms.service.CmsClientAppletService;
import com.promote.appletpromote.entity.TbClientApplet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/cmsClientAppletController")
public class CmsClientAppletController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsClientAppletController.class);

    @Resource
    private CmsClientAppletService cmsClientAppletService;


    @PostMapping("/add")
    private Map<String,String> add(@RequestBody TbClientApplet tbClientApplet){

        LOGGER.info("CmsClientAppletController  add 获取的插入对象为{}",tbClientApplet);

        int add = cmsClientAppletService.insertSelective(tbClientApplet);
        if(add ==1){

        }
        return null;
    }


    @PostMapping("/del/{id}")
    private Map<String,String> del(@PathVariable("id") Integer id){
        LOGGER.info("CmsClientAppletController  del 获取的删除的ID{}",id);

        TbClientApplet tbClientApplet = new TbClientApplet();
        tbClientApplet.setIsDel(1);
        tbClientApplet.setId(id);
        int edit = cmsClientAppletService.updateByPrimaryKey(tbClientApplet);
        if(edit ==1){

        }
        return null;
    }



    @PostMapping("/update/{id}")
    private Map<String,String> update(@RequestBody TbClientApplet tbClientApplet){
        LOGGER.info("CmsClientAppletController  update 获取需要修改的参数{}",tbClientApplet.toString());
        cmsClientAppletService.updateByPrimaryKeySelective(tbClientApplet);
        return null;
    }




    @PostMapping("/selectByParam")
    @ResponseBody
    public Map<String,Object> selectByParam(@RequestBody TbClientApplet tbClientApplet){
        Map<String,Object> result = new HashMap<>();
        LOGGER.info("CmsClientAppletController  update 获取查询的参数{}",tbClientApplet.toString());
        tbClientApplet.setIsDel(0);
        List<TbClientApplet> tbOwnAppletList  = cmsClientAppletService.selectByParam(tbClientApplet);
        result.put("data",tbOwnAppletList);
        return result;
    }


    @PostMapping("/selectByPrimaryKey/{id}")
    @ResponseBody
    public Map<String,Object> selectByPrimaryKey(@PathVariable("id") Integer id){
        Map<String,Object> result = new HashMap<>();
        LOGGER.info("CmsClientAppletController  selectByPrimaryKey 获取查询的参数{}",id);
        TbClientApplet tbClientApplet  = cmsClientAppletService.selectByPrimaryKey(id);
        result.put("data",tbClientApplet);
        return result;
    }

}
