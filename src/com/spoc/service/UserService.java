package com.spoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoc.dao.UserDao;
import com.spoc.po.Student;



@Service("userService")
public class UserService
{
	@Autowired
	private UserDao userDao;

	public boolean find(String username,String password)
	{
		boolean flag=userDao.find(username,password);	
		return flag;
	}
	public UserDao getUserDao()
	{
		return userDao;
	}
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

}



