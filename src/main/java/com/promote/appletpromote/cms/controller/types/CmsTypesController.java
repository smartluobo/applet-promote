package com.promote.appletpromote.cms.controller.types;

import com.promote.appletpromote.cms.service.CmsTypesService;
import com.promote.appletpromote.entity.TbTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cmsTypesController")
public class CmsTypesController {


    private static final Logger LOGGER = LoggerFactory.getLogger(CmsTypesController.class);

    @Resource
    private CmsTypesService cmsTypesService;


    @PostMapping("/add")
    private Map<String,String> add(@RequestBody TbTypes tbTypes){

        LOGGER.info("CmsOwnAppletController  add 获取的插入对象为{}",tbTypes);

        int add = cmsTypesService.insertSelective(tbTypes);
        if(add ==1){

        }
        return null;
    }


    @PostMapping("/del/{id}")
    private Map<String,String> del(@PathVariable("id") Integer id){
        LOGGER.info("CmsOwnAppletController  del 获取的删除的ID{}",id);

        TbTypes tbTypes = new TbTypes();
        int edit = cmsTypesService.updateByPrimaryKey(tbTypes);
        if(edit ==1){

        }
        return null;
    }



    @PostMapping("/update/{id}")
    private Map<String,String> update(@RequestBody TbTypes tbTypes){
        LOGGER.info("CmsOwnAppletController  update 获取需要修改的参数{}",tbTypes.toString());
        cmsTypesService.updateByPrimaryKeySelective(tbTypes);
        return null;
    }




    @PostMapping("/selectByParam")
    @ResponseBody
    public Map<String,Object> selectByParam(@RequestBody TbTypes tbTypes){
        Map<String,Object> result = new HashMap<>();
        LOGGER.info("CmsOwnAppletController  update 获取查询的参数{}",tbTypes.toString());
        List<TbTypes> TbTypesList  = cmsTypesService.selectByParam(tbTypes);
        result.put("data",TbTypesList);
        return result;
    }


    @PostMapping("/selectByPrimaryKey/{id}")
    @ResponseBody
    public Map<String,Object> selectByPrimaryKey(@PathVariable("id") Integer id){
        Map<String,Object> result = new HashMap<>();
        LOGGER.info("CmsOwnAppletController  selectByPrimaryKey 获取查询的参数{}",id);
        TbTypes tbTypes  = cmsTypesService.selectByPrimaryKey(id);
        result.put("data",tbTypes);
        return result;
    }

}
