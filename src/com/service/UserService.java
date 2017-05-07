package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.daoImpl.UserDaoImpl;
@Service
public class UserService {
	@Autowired
     private UserDaoImpl userDaoImpl;
     //
     //通过用户名找用户
     public User findUserByname(String username){
    	 return userDaoImpl.findUser(username);
     }
     //添加注册用户
     public boolean addUser(User user){
    	 if(userDaoImpl.findUser(user.getUsername())!=null)
    		 return false;
    	 else {
			userDaoImpl.add(user);
			return true;
		}
     }
}
