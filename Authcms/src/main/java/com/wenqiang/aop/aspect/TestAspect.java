package com.wenqiang.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {
	 final static Logger log = LoggerFactory.getLogger(TestAspect.class);
    @Pointcut("execution(public * com.wenqiang.service.*.*(..)) && @annotation(com.wenqiang.aop.MyAnnotation)" )
    public void TestAdvice(){}  
    
    @Around("TestAdvice()")
    public void Interceptor(ProceedingJoinPoint pjp){
        Object result = null; 
        Object[] args = pjp.getArgs();
        if(args != null && args.length >0) {
            String deviceId = (String) args[0];
             if("2".equals(deviceId)) {
            	 log.info("测试自定义注解");
             }
        }     
        try {
            result =pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }  
      
    }
}