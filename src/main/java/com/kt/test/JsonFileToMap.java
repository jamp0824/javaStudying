package com.kt.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class JsonFileToMap {
	
	public static void main(String[] args) { 
		
		try { 
			ObjectMapper mapper = new ObjectMapper(); 
			
			Map<String, Object> map = mapper.readValue(new File("c:\\Users\\junee\\user.json"), 
					new TypeReference<Map<String, Object>>() {}); 
			
			System.out.println(map.get("name")); 
			System.out.println(map.get("age")); 
			System.out.println(map.get("messages")); 
			
			ArrayList<String> list = (ArrayList<String>) map.get("messages"); 
			
			for (String msg : list) { 
				
				System.out.println(msg); 
			} 
			} catch (JsonGenerationException e) { 
				e.printStackTrace(); 
			} catch (JsonMappingException e) { 
				e.printStackTrace(); 
				
			} catch (IOException e) { 
				e.printStackTrace(); 
			}
	}

}
