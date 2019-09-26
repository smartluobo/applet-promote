package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.tbClientApplet;

import java.util.List;

public interface CmsClientAppletService {

    int deleteByPrimaryKey(Integer id);

    int insert(tbClientApplet record);

    int insertSelective(tbClientApplet record);

    tbClientApplet selectByPrimaryKey(Integer id);

    List<tbClientApplet> selectByParam(tbClientApplet record);


    int updateByPrimaryKeySelective(tbClientApplet record);

    int updateByPrimaryKey(tbClientApplet record);
}
