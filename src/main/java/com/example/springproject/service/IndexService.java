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
	private UserRepository userRepository ;
	
	
	public List<User> addUser(User user){
		
		return userRepository.add(user);
	}
	
	public User appendZ(User user){
		String firstname = user.getFirstname() + "Z";
		user.setFirstname(firstname);
		return user;
//		int count = user.getFirstname().length() ;
//		String show = "" ;
//		if(count<5){
//			show = "Less than 5";
//		}else{
//			show = "More than 5";
//		}
//		user.setFirstname(show);
//		return user;
	}
	
	public User futureage(User user){
		int age = user.getFutureage() + 10 ;
		user.setFutureage(age);
		return user;
	}
	
	
	public Map<String, String> appendZ(Map<String, String> map){
		
		String name = map.get("name");
		name = name + "Z" ;
		map.put("name", name);
		
		return map;
	}

	public List<User> getUser() {
	
		return userRepository.getAll();
	}
}
