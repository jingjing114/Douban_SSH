package com.neu.cxl.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Utils {
	public static boolean sendcode(String phone,String code) throws IOException
	{
		String codestr=URLEncoder.encode("#code#="+code,"utf-8");
		URL url=new URL("http://v.juhe.cn/sms/send?mobile="+phone+"&tpl_id=90713&tpl_value="+codestr+
				"&key=7dcf58361bde6e84e748997a2773f88a");
		URLConnection connection=url.openConnection();
		connection.connect();
	
		BufferedReader buff=new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8")); 
			
		StringBuffer buffer=new StringBuffer();
		String lineData=null;
		while((lineData=buff.readLine())!=null)
		{
			buffer.append(lineData);
		}
		buff.close();
		if(buffer.toString().indexOf("\"error_code\":0")>=0)
		{
			return true;
		}
	
		return false;
		
	}

}
