package com.promote.appletpromote.mapper;

import com.promote.appletpromote.entity.ApiGames;
import com.promote.appletpromote.entity.TbApiUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbApiCommonMapper {


    List<ApiGames> getAppletByTypeId(Integer id);

}