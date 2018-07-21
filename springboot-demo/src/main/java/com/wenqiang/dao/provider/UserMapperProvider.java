package com.wenqiang.dao.provider;

import org.springframework.util.StringUtils;

/** 
 * @author 作者  文强
 * @version 创建时间：2018年7月11日 下午5:39:09 
 * 类说明 
 */
public class UserMapperProvider {
	// 动态生成sql
    public String findByNameLike(String name) {
        String sql = "SELECT * FROM weixin_account";
        if (StringUtils.isEmpty(name)) {
            return sql;
        }
        sql += " WHERE accountname LIKE '%" + name + "%'";
        return sql;
    }

}
