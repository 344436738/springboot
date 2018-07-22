package com.wenqiang.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.wenqiang.pojo.Menu;
import com.wenqiang.pojo.WeixinAccount;
import com.wenqiang.service.MenuService;
import com.wenqiang.service.WeixinAccountService;


@RestController
@RequestMapping("api")
public class TestController  extends BaseController{
	
	@Autowired
	private Environment env;
	
	@Autowired
	private  WeixinAccountService  weixinAccountService;
	
	@Autowired
	private  MenuService  menuService;
	
    @PostMapping("/testPost")
	public String getTest(){
		return "第一个springboot程序!"+env.getProperty("url")+weixinAccountService.getWeixinAccount("2");
	}
    
    
    
   @GetMapping(value="{name}")
   	public  List<WeixinAccount>   getWeixinAccount(@PathVariable("name") String name){
   
   		return weixinAccountService.findByName(name);
   	}
    
    
    @GetMapping("/fingAll")
   	public   ModelAndView  fingAll(HttpServletRequest request,HttpServletResponse response){
    	  ModelAndView mv = new ModelAndView();
    	  mv.setViewName("index");
    	  mv.addObject("data", weixinAccountService.fingAll());
	   	    return mv;
   	}
    
    @PostMapping("/JsonTest")
    public HashMap<String, Object> getTestJson(HttpServletRequest  request) throws JSONException, IOException{
		return paramConvert(request);
	}
}
