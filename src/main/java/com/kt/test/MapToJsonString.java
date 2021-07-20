package com.kt.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class MapToJsonString {

	public static void main(String[] args) { 
		try { 
			System.out.println("-------------------MAP을 JSON String으로 변환-----------------------"); 
			
			ObjectMapper mapper = new ObjectMapper(); 
//			ObjectMapper class ObjectMapper provides functionality for reading and writing JSON, 
//			either to and from basic POJOs (Plain Old Java Objects), or to and from a general-purpose 
//			JSON Tree Model (JsonNode), as well as related functionality for performing conversions
			
			
			String json2 = ""; 
			
			Map<String, Object> map2 = new HashMap<String, Object>(); 
			
			map2.put("name", "mkgil"); map2.put("age", 25); 
			//json2 = mapper.writeValueAsString(map2); 
			
			json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map2); 
			
			System.out.println(json2); 
		} catch (JsonGenerationException e) {
			e.printStackTrace(); 
		} catch (JsonMappingException e) { 
			e.printStackTrace(); 
		} catch (IOException e) { 
			e.printStackTrace();
			} 
		}
		
	}


