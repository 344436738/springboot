package com.wenqiang.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;



public class BaseController {
	protected final Log logger = LogFactory.getLog(this.getClass());
	

	
	/**
	 * 读取请求报文
	 * @param request
	 * @return
	 */
	protected String getLines(HttpServletRequest request){
		StringBuilder sb = new StringBuilder();
		BufferedReader reader;
		try {
			reader = request.getReader();
			String line;
			while ((line = reader.readLine()) != null)
				sb.append(line);
		} catch (IOException e) {
			logger.error("陆运服务读取请求报文出现异常",e);
		}

		return sb.toString();
	}
	
	

	
	/**
	 * 
	 * @Description:参数过滤方法
	 * @author Administrator 朱俊一
	 * @date 2018年5月30日
	 * @version 1.0
	 * @param param 空Map
	 * @param body  解析body放入Map中
	 * @throws IOException 
	 * @throws JSONException 
	 */
  	protected HashMap<String, Object>  paramConvert(HttpServletRequest request) throws IOException, JSONException{
  		HashMap<String, Object> param = new HashMap<String, Object>();
  		StringBuilder sb = new StringBuilder();
		Object obj = "";
  		BufferedReader reader = request.getReader();
    	String line;
    	while ((line = reader.readLine()) != null)  
    		sb.append(line);
    	String content = sb.toString();
		JSONObject paramData = new JSONObject(content);
	
  		try {
  			Iterator it = paramData.keys();
  			while(it.hasNext()){
  				Object key = it.next();
  				if(key instanceof String){
  					String k = key.toString();
  					param.put(k, paramData.get(k).toString());
  				}
  			}
  		} catch (JSONException e) {
  			logger.error("参数转换错误" + e.getMessage() + e.getMessage());
  		}
		return param;
  	}
	
	
	
}
