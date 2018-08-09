package com.yummy.utils;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * spring事件拦截
 */
@Component
public class ApplicationHandler implements ApplicationListener {
    private  volatile int reraultCount=0;
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
      if(applicationEvent instanceof RequestHandledEvent){
           // reraultCount++;
            //System.out.printf("请求次数："+reraultCount+"\n");
        }

    }


}
