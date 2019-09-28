package com.promote.appletpromote.cms.service.impl;

import com.promote.appletpromote.cms.service.CmsCarouselService;
import com.promote.appletpromote.entity.ApiBannerImg;
import com.promote.appletpromote.entity.TbCarousel;
import com.promote.appletpromote.mapper.TbCarouselMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CmsCarouselServiceImpl implements CmsCarouselService {

    @Resource
    private TbCarouselMapper tbCarouselMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tbCarouselMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbCarousel record) {
        return tbCarouselMapper.insert(record);
    }

    @Override
    public int insertSelective(TbCarousel record) {
        return tbCarouselMapper.insertSelective(record);
    }

    @Override
    public TbCarousel selectByPrimaryKey(Integer id) {
        return tbCarouselMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbCarousel> selectByParam(TbCarousel record) {
        return tbCarouselMapper.selectByParam(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TbCarousel record) {
        return tbCarouselMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<ApiBannerImg> getBannerImg() {
        return tbCarouselMapper.getBannerImg();
    }

    @Override
    public int updateByPrimaryKey(TbCarousel record) {
        return tbCarouselMapper.updateByPrimaryKey(record);
    }
}
