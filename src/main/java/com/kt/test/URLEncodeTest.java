package com.kt.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncodeTest {
	public static void main(String[] args) {
		String url = null;
		try{
			url = URLEncoder.encode("한글 인코딩 이라네~","UTF-8");
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		System.out.println(url);
	}
}
