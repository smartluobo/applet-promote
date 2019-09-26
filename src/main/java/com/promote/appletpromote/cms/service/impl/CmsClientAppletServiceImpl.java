package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsClientAppletService;
import com.promote.appletpromote.entity.TbClientApplet;
import com.promote.appletpromote.mapper.TbClientAppletMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CmsClientAppletServiceImpl implements CmsClientAppletService {


    @Resource
    private TbClientAppletMapper tbClientAppletMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TbClientApplet record) {
        return 0;
    }

    @Override
    public int insertSelective(TbClientApplet record) {
        return 0;
    }

    @Override
    public TbClientApplet selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<TbClientApplet> selectByParam(TbClientApplet record) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TbClientApplet record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TbClientApplet record) {
        return 0;
    }
}
