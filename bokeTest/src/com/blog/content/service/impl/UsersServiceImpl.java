package com.blog.content.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Users;
import com.blog.content.mybatis.dao.UsersDao;
import com.blog.content.service.UsersService;

@Service("UsersService")
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersDao;
//	
	@Override
	public List<Users> selectUsers() {
		return this.usersDao.Users();
	}
}
