package com.devin.company_profile.utils;

import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

public class HibernateUtil extends ActionSupport{
	public static SessionFactory sessionFactory;
	static{
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory =configuration.buildSessionFactory();
		
	}
	
	public static String dateFormat(Date date) {
		DateFormat dateFormatterChina = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);//格式化输出
		TimeZone timeZoneChina = TimeZone.getTimeZone("Asia/Shanghai");//获取时区
		dateFormatterChina.setTimeZone(timeZoneChina);//设置系统时区
		String time = dateFormatterChina.format(date.getTime());
		return time;
	}
	
	
}
