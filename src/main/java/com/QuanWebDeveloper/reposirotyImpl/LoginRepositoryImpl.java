package com.QuanWebDeveloper.reposirotyImpl;

import com.QuanWebDeveloper.Entity.User;

public interface LoginRepositoryImpl {
	public User check(String email, String password);
}
