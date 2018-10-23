package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Users;
import com.mybatis.dao.SelectUsersDao;
import com.service.SelectUsersService;

@Service("SelectUsersService")
public class SelectUsersServiceImpl implements SelectUsersService{

	@Autowired
	private SelectUsersDao selectUsersDao;
//	
	@Override
	public List<Users> selectUsers() {
		return this.selectUsersDao.SelectUsers();
//		Users users = this.selectUsersDao.SelectUsers();
//		return users;
	}
}
