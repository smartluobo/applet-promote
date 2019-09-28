package com.promote.appletpromote.cms.service;


import com.promote.appletpromote.entity.ApiGame;
import com.promote.appletpromote.entity.TbClientApplet;

import java.util.List;

public interface CmsClientAppletService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbClientApplet record);

    int insertSelective(TbClientApplet record);

    TbClientApplet selectByPrimaryKey(Integer id);

    ApiGame selectById(Integer id);


    List<TbClientApplet> selectByParam(TbClientApplet record);

    int updateByPrimaryKeySelective(TbClientApplet record);

    int updateByPrimaryKey(TbClientApplet record);
}
