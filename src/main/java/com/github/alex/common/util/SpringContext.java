package com.github.alex.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by alex on 2018/9/27.
 */
@Component
public class SpringContext {

    @Autowired
    private static ApplicationContext applicationContext;

    /**
     * 获取bean
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

}
