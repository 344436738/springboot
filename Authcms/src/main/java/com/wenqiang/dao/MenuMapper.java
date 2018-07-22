package com.wenqiang.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wenqiang.pojo.Menu;

/** 
 * @author 作者  文强
 * @version 创建时间：2018年7月11日 上午11:09:12 
 * 类说明 
 */
@Mapper
@Repository
public interface MenuMapper{

    @Select("select * from menu")
    public List<Map<String,Object>>findMenu();
}
