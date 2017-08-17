package com.lhfeiyu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lhfeiyu.po.Stinsertstorageparticular;

public interface StinsertstorageparticularMapper {
    Integer count(Integer id);
    Integer add(Stinsertstorageparticular stinsertstorageparticular);
    Integer delete(Integer id);
    Integer update(Stinsertstorageparticular stinsertstorageparticular);
    List<Stinsertstorageparticular> find(Stinsertstorageparticular stinsertstorageparticular);
}