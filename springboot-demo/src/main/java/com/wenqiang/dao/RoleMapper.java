package com.wenqiang.dao;

import java.util.List;

import com.wenqiang.pojo.Role;
import com.wenqiang.util.MyMapper;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}