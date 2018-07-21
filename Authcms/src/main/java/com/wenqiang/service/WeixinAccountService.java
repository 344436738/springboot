package com.wenqiang.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenqiang.aop.MyAnnotation;
import com.wenqiang.dao.WeixinAccountMapper;
import com.wenqiang.pojo.WeixinAccount;
import com.wenqiang.util.DatabaseContextHolder;
import com.wenqiang.util.DatabaseType;

@Service
@Transactional
public class WeixinAccountService{
	private final static Logger log= Logger.getLogger(WeixinAccountService.class);
	@Autowired
	WeixinAccountMapper    weixinAccountMapper;

	 public  List<Map<String,Object>> selectPage(){
		return  this.weixinAccountMapper.find();
	   } 

	 
	 
	 public  List<WeixinAccount> fingAll(){
			return  this.weixinAccountMapper.fingAll();
		   } 

		
	@MyAnnotation
	public WeixinAccount getWeixinAccount(String id){
		DatabaseContextHolder.setDatabaseType(DatabaseType.utilmysql);
		return  this.weixinAccountMapper.findByIdF(Integer.parseInt(id));
	}


	public   List<WeixinAccount> findByName(String name){
		return  this.weixinAccountMapper.findByNameLike(name);
	}

	
}