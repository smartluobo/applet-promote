package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsClientAppletService;
import com.promote.appletpromote.entity.tbClientApplet;

import javax.annotation.Resource;
import java.util.List;

public class CmsClientAppletServiceImpl implements CmsClientAppletService {

    @Resource
    private tbClientApplet tbClientApplet;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(tbClientApplet record) {
        return 0;
    }

    @Override
    public int insertSelective(tbClientApplet record) {
        return 0;
    }

    @Override
    public tbClientApplet selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<tbClientApplet> selectByParam(tbClientApplet record) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(tbClientApplet record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(tbClientApplet record) {
        return 0;
    }
}
