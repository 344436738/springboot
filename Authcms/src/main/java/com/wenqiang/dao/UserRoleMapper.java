package com.wenqiang.dao;

import java.util.List;

import com.wenqiang.pojo.UserRole;
import com.wenqiang.util.MyMapper;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}