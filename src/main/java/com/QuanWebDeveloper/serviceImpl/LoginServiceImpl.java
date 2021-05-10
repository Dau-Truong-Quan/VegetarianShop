package com.QuanWebDeveloper.serviceImpl;

import com.QuanWebDeveloper.Entity.User;

public interface LoginServiceImpl {
	public User check(String email, String password);
}
