package com.example.springproject.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.model.User;
import com.example.springproject.repository.UserRepository;

@Service
public class IndexService {

	@Autowired
	private UserRepository userRopository ;
	
	
	public List<User> addUser(User user){
		
		return userRopository.add(user);
		
	}
	
	public User appendZ(User user){
		String firstname = user.getFirstname() + "Z";
		user.setFirstname(firstname);
		return user;
	}
	
	
	public Map<String, String> appendZ(Map<String, String> map){
		
		String name = map.get("name");
		name = name + "Z" ;
		map.put("name", name);
		
		return map;
	}

	public List<User> getUser() {
	
		return userRopository.getAll();
	}
}
