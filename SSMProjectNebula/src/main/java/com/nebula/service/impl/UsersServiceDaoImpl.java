package com.nebula.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nebula.bean.Users;
import com.nebula.dao.UsersDao;
import com.nebula.service.UsersServiceDao;

@Component(value = "usersServiceDao")
public class UsersServiceDaoImpl implements UsersServiceDao{

	@Autowired
	UsersDao usersDao;
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usersDao.getAllUsers();
	}
	@Override
	public void addUsers(@Param("users")Users users) {
		// TODO Auto-generated method stub
		usersDao.addUsers(users);
	}
	@Override
	public void updateUsers(@Param("users")Users users) {
		// TODO Auto-generated method stub
		usersDao.updateUsers(users);
	}
	@Override
	public void delUsers(@Param("users")Users users) {
		// TODO Auto-generated method stub
		usersDao.delUsers(users);
	}
	@Override
	public List<Users> findUsersById(int uid) {
		// TODO Auto-generated method stub
		return usersDao.findUsersById(uid);
	}

	
}
