package com.wenqiang.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.wenqiang.dao.MenuMapper;
import com.wenqiang.pojo.Menu;

/** 
 * @author 作者  文强
 * @version 创建时间：2018年7月11日 上午11:09:54 
 * 类说明 
 */
@Service
@Transactional
public class MenuService {
	private final static Logger log= Logger.getLogger(MenuService.class);
	@Autowired
	MenuMapper    menuMapper;

	
	 
	 
	 public  List<Map<String,Object>> selectAll(){
			return  this.menuMapper.findMenu();
		   } 
}
