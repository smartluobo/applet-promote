package com.promote.appletpromote.cms.service;

import com.promote.appletpromote.entity.TbCarousel;

import java.util.List;

public interface CmsCarouselService {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCarousel record);

    int insertSelective(TbCarousel record);

    TbCarousel selectByPrimaryKey(Integer id);

    List<TbCarousel> selectByParam(TbCarousel record);


    int updateByPrimaryKeySelective(TbCarousel record);

    int updateByPrimaryKey(TbCarousel record);

}
