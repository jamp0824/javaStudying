package com.kt.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLDecodeTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String url =null;
		
		try{
			url = URLDecoder.decode("%ED%95%9C%EA%B8%80+%EC%9D%B8%EC%BD%94%EB%94%A9+%EC%9D%B4%EB%9D%BC%EB%84%A4%7E","UTF-8");
		}catch(UnsupportedClassVersionError e){
			e.printStackTrace();
		}
		System.out.println(url);
	}
}
