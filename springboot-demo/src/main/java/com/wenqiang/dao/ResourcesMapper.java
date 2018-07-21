package com.wenqiang.dao;



import java.util.List;
import java.util.Map;

import com.wenqiang.pojo.Resources;
import com.wenqiang.util.MyMapper;

public interface ResourcesMapper extends MyMapper<Resources> {

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String,Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}