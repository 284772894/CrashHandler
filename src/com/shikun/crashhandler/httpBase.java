package com.shikun.crashhandler;

import java.net.HttpURLConnection;
import java.net.URL;

import android.util.Log;

public class httpBase {

	//����һ��GET����
	 public static void get(String path) throws Exception{
		 try{  
			    HttpURLConnection urlConn = null;  
	            //ͨ��openConnection ����  
	            URL url = new java.net.URL(path);  
	            urlConn=(HttpURLConnection)url.openConnection();  
	            Log.i("get", path);

	            Log.i("get", urlConn.getResponseMessage().toString());
	            //��������������   
//	            urlConn.setDoOutput(true);  
//	            urlConn.setDoInput(true);  
//	            //�ر�����  
	            urlConn.disconnect();  
	        }catch(Exception e){  
	           
	            e.printStackTrace();  
	        }  
	 
	 }



}
