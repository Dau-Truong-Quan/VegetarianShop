package com.QuanWebDeveloper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuanWebDeveloper.Entity.User;
import com.QuanWebDeveloper.repository.LoginRepository;
import com.QuanWebDeveloper.serviceImpl.LoginServiceImpl;

@Service
public class LoginService implements LoginServiceImpl{

	@Autowired
	private LoginRepository loginRepository;
	
	public User check(String email, String password) {
		// TODO Auto-generated method stub
		return loginRepository.check(email, password);
	}
	
}
