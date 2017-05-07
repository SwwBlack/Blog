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
     //通过usrname找用户
     public User findUserByname(String username){
    	 return userDaoImpl.findUser(username);
     }
     
}
