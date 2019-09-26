package com.promote.appletpromote.cms.service;


import com.promote.appletpromote.entity.TbOwnApplet;

import java.util.List;

public interface CmsOwnAppletService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbOwnApplet record);

    int insertSelective(TbOwnApplet record);

    TbOwnApplet selectByPrimaryKey(Integer id);

    List<TbOwnApplet> selectByParam(TbOwnApplet tbOwnApplet);

    int updateByPrimaryKeySelective(TbOwnApplet record);

    int updateByPrimaryKey(TbOwnApplet record);

}
