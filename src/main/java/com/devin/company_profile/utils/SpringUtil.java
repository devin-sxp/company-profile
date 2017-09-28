package com.devin.company_profile.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Devin on 2017/8/2.
 */
public class SpringUtil {
    public static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }
}
