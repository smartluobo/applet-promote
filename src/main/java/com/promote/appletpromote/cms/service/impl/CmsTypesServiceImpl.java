package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsTypesService;
import com.promote.appletpromote.entity.TbTypes;
import com.promote.appletpromote.mapper.TbTypesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CmsTypesServiceImpl implements CmsTypesService {


    @Resource
    private TbTypesMapper tbTypesMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TbTypes record) {
        return 0;
    }

    @Override
    public int insertSelective(TbTypes record) {
        return 0;
    }

    @Override
    public TbTypes selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<TbTypes> selectByParam(TbTypes record) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TbTypes record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TbTypes record) {
        return 0;
    }
}
