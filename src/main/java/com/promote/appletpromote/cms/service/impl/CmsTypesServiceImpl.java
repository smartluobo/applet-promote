package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsTypesService;
import com.promote.appletpromote.entity.ApiTypes;
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
        return tbTypesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbTypes record) {
        return tbTypesMapper.insert(record);
    }

    @Override
    public int insertSelective(TbTypes record) {
        return tbTypesMapper.insertSelective(record);
    }

    @Override
    public TbTypes selectByPrimaryKey(Integer id) {
        return tbTypesMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbTypes> selectByParam(TbTypes record) {
        return tbTypesMapper.selectByParam(record);
    }

    @Override
    public List<ApiTypes> getTpyes(TbTypes record) {
        return tbTypesMapper.getTpyes(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TbTypes record) {
        return tbTypesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbTypes record) {
        return tbTypesMapper.updateByPrimaryKey(record);
    }
}
