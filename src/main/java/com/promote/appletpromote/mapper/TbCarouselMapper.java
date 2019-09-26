package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.TbCarousel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TbCarouselMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCarousel record);

    int insertSelective(TbCarousel record);

    TbCarousel selectByPrimaryKey(Integer id);

    List<TbCarousel> selectByParam(TbCarousel record);


    int updateByPrimaryKeySelective(TbCarousel record);

    int updateByPrimaryKey(TbCarousel record);
}