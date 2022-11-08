package com.userregistrationnew.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.userregistrationnew.entities.User;

@Service
public class UserServiceImpl implements UserService {
	
	
	
	
	List<User> list;
	public UserServiceImpl() {
		list=new ArrayList<>();
		list.add(new User(1,"Shivam","tiwari,","shivamtiwari760@gmail.com","8750248608"));
		list.add(new User(2,"Shubham","tiwari,","shubamt28598@gmail.com","8470867199"));

	}

	@Override
	public List<User> getUsers() {
		return list;
	}

	@Override
	public User getUser(long userId) {
		User u = null;
		for(User user : list) {
			if(user.getId()==userId) {
				u= user;
				break;
			}
		}
		return u;
	}

	@Override
	public User addUser(User user) {
		list.add(user);
		return user;
	}

}
