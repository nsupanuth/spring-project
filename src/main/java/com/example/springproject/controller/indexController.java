package com.example.springproject.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
	
	private static Map<String, String> MAPS = new HashMap<String, String>();
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public Map<String, String> get(){
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name",Arrays.asList("this","is","my","name"));	
//		return map;
		
		return MAPS;
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public Map<String, String> post(@RequestBody Map<String, String> map){
		MAPS.putAll(map);
		return MAPS;	
	}
}
