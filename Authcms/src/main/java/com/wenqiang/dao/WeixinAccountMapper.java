package com.wenqiang.dao;


import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.wenqiang.dao.provider.UserMapperProvider;
import com.wenqiang.pojo.WeixinAccount;




/** 
* @author 作者  wenqiang
* @version 创建时间：2018年7月11日 上午11:07:50 
* 类说明 
*/ 
@org.apache.ibatis.annotations.Mapper
public interface WeixinAccountMapper{

	
	

	    @Select("select * from weixin_account;")
	    public  List<Map<String,Object>> find();
	    
	 
	    public WeixinAccount queryById(String id);
	    
	    
	    
	 // 获取主键
	    @Insert("INSERT INTO weixin_account(accountname,accounttoken,accountnumber,accounttype,accountemail,accountdesc,accountaccesstoken,accountappid,accountappsecret,ADDTOEKNTIME,USERNAME,WEIXIN_ACCOUNTID,userid) VALUES (#{accountname},#{accounttoken},#{accountnumber},#{accounttype},#{accountemail},#{accountdesc},#{accountaccesstoken},#{accountappid},#{accountappsecret},now(),#{USERNAME},#{WEIXIN_ACCOUNTID},#{userid}) ")
	    @Options(useGeneratedKeys = true, keyProperty = "id")
	    int insert(WeixinAccount user);

	    @Delete("DELETE FROM weixin_account WHERE id　= #{id}")
	    int delete(@Param("id") Integer id);

	    @Update("UPDATE weixin_account SET name = #{name}, password = #{password} WHERE id = #{id}")
	    int update(WeixinAccount user);

	    @Select("SELECT id,accountname,accounttoken,accountnumber,accounttype,accountemail,accountdesc,accountaccesstoken,accountappid,accountappsecret,ADDTOEKNTIME,USERNAME,WEIXIN_ACCOUNTID,userid FROM weixin_account WHERE id = #{id}")
	    @Results(id = "userMap", value = { @Result(column = "id", property = "id", javaType = Integer.class),
	    		@Result( column="accountname", property="accountname", javaType=String.class),
   	            @Result( column="accounttoken", property="accounttoken", javaType=String.class),
   	            @Result( column="accountnumber", property="accountnumber", javaType=String.class),
   	            @Result( column="accounttype", property="accounttype", javaType=String.class),
   	            @Result( column="accountemail", property="accountemail", javaType=String.class),
   	            @Result( column="accountdesc", property="accountdesc", javaType=String.class),
   	            @Result( column="accountaccesstoken", property="accountaccesstoken", javaType=String.class),
   	            @Result( column="accountappid", property="accountappid", javaType=String.class),
   	            @Result( column="accountappsecret", property="accountappsecret", javaType=String.class),
   	            @Result( column="ADDTOEKNTIME", property="addtoekntime", javaType=Date.class),
   	            @Result( column="USERNAME", property="username", javaType=String.class),
   	            @Result( column="WEIXIN_ACCOUNTID", property="weixinAccountid", javaType=String.class),
   	            @Result( column="userid", property="userid",javaType = Integer.class)})
	    WeixinAccount findByIdF(Integer id);

	    @Select("SELECT * FROM weixin_account")
	    @ResultMap("userMap")
	    List<WeixinAccount> fingAll();
	    
	    
	
	    // 动态生成sql
	    @SelectProvider(type = UserMapperProvider.class, method = "findByNameLike")
	    List<WeixinAccount> findByNameLike(String name);
	    
}