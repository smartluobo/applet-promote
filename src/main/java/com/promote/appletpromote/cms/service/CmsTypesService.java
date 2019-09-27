package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.ApiTypes;
import com.promote.appletpromote.entity.TbTypes;

import java.util.List;

public interface CmsTypesService {

    int deleteByPrimaryKey(Integer id);

    int insert(TbTypes record);

    int insertSelective(TbTypes record);

    TbTypes selectByPrimaryKey(Integer id);

    List<TbTypes> selectByParam(TbTypes record);

    List<ApiTypes> getTpyes(TbTypes record);

    int updateByPrimaryKeySelective(TbTypes record);

    int updateByPrimaryKey(TbTypes record);
}
