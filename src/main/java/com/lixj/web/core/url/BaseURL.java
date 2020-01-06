package com.lixj.web.core.url;

import java.lang.reflect.Field;

public class BaseURL
{
	public static final String DYNAMIC_WEB_SUFFIX = ".htm";
	
	public static final String MESSAGE_SUCCESS = "/message/success";
	
	public static final String MESSAGE_ERROR = "/message/error";

	/**
	 * @description: 根据url静态变量名取url值
	 *
	 * @param urlName
	 * @return
	 * @author： lixj
	 * @createTime：2020年1月6日17:50:11
	 */
	public String getURL(String urlName)
	{
		String url = "";
		
		try
		{
			Field f = this.getClass().getField(urlName);
			
			url = f.get(null).toString();
		} 
		catch (Exception e)
		{
			url = "";
		}
		
		return url;
	}
}
