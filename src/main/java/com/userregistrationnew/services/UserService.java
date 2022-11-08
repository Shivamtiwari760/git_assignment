package com.userregistrationnew.services;

import java.util.List;

import com.userregistrationnew.entities.User;

public interface UserService {
	
	public List<User>getUsers();
	
	
	public User getUser(long userId);
	
	
	public User addUser(User user);
	

}
