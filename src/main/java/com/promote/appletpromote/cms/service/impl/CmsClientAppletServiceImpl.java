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
        return tbClientAppletMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbClientApplet record) {
        return tbClientAppletMapper.insert(record);
    }

    @Override
    public int insertSelective(TbClientApplet record) {
        return tbClientAppletMapper.insertSelective(record);
    }

    @Override
    public TbClientApplet selectByPrimaryKey(Integer id) {
        return tbClientAppletMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbClientApplet> selectByParam(TbClientApplet record) {
        return tbClientAppletMapper.selectByParam(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TbClientApplet record) {
        return tbClientAppletMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbClientApplet record) {
        return tbClientAppletMapper.updateByPrimaryKey(record);
    }
}
