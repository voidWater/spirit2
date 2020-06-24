package voidshell.spirit.BM.hymake.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface StatExMapper {

    @Select("${sql}")
    List<Map<String,Object>> freedomStat(String sql);
}
