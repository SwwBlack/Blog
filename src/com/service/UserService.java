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
     //ͨ���û������û�
     public User findUserByname(String username){
    	 return userDaoImpl.findUser(username);
     }
     //���ע���û�
     public boolean addUser(User user){
    	 if(userDaoImpl.findUser(user.getUsername())!=null)
    		 return false;
    	 else {
			userDaoImpl.add(user);
			return true;
		}
     }
}
