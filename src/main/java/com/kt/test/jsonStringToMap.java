package com.kt.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class jsonStringToMap {
	public static void main(String[] args) { 
		try { 
			System.out.println("-------------------JSON String 을 MAP 으로 변환-----------------------"); 
			ObjectMapper mapper = new ObjectMapper(); 
			
			String json = "{ \"name\" : \"mkgil\" , \"age\" : 25 }"; 
			
			Map<String, Object> map = new HashMap<String, Object>(); 
			
			map = mapper.readValue(json, new TypeReference<Map<String, String>>(){}); 
			
			System.out.println(map); 
			System.out.println(map.get("name")); 
		} catch (JsonGenerationException e) { 
			e.printStackTrace(); 
		} catch (JsonMappingException e) { 
			e.printStackTrace(); 
		} catch (IOException e) { 
			e.printStackTrace(); 
			} 
		}


}
