package com.kt.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class MapToJsonFile {

	public static void main(String[] args) { 
		
		try { 
			
			ObjectMapper mapper = new ObjectMapper(); 
			
			Map<String, Object> map = new HashMap<String, Object>(); 
			
			map.put("name", "mkgil"); 
			map.put("age", 25); 
			
			List<Object> list = new ArrayList<Object>(); 
			list.add("msg 1"); 
			list.add("msg 2"); 
			list.add("msg 3"); 
			map.put("messages", list); 
			mapper.writeValue(new File("c:\\Users\\junee\\user.json"), map); 
		} catch (JsonGenerationException e) { 
			e.printStackTrace(); 
		} catch (JsonMappingException e) { 
			e.printStackTrace(); 
		} catch (IOException e) { 
			e.printStackTrace(); 
		} 
		}

}
