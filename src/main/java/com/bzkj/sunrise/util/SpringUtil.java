package com.bzkj.sunrise.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


@Service
 public class SpringUtil implements ApplicationContextAware {
 
     /**
     * 当前IOC
      */
     private static ApplicationContext applicationContext;
 
     /**
      * 设置当前上下文环境，此方法由spring自动装配
      */
     @Override
     public void setApplicationContext(ApplicationContext arg0)
             throws BeansException {
    	 System.out.println("!!!!!!!!!!!!!");
         applicationContext = arg0;
     }
 
     /**
      * 从当前IOC获取bean
      * 
      * @param id
      *            bean的id
      * @return
      */
     public static Object getBean(String id) {
         Object object = null;
         object = applicationContext.getBean(id);
        return object;
     }


 
 }
