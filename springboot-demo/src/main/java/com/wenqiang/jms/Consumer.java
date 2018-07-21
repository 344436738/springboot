package com.wenqiang.jms;

import java.util.Map;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author shiwenqiang
 * 消费者
 * 2018年7月9日
 */
@Component
public class Consumer {
	
   @JmsListener(destination="text")
   public void readMessage(String text){
		System.out.println("接收到消息："+text);
	}	
   @JmsListener(destination="itcast_map")
	public void readMap(Map map){
		System.out.println(map);		
	}

}
