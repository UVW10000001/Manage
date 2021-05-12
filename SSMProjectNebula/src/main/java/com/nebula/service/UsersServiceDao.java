package com.nebula.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.nebula.bean.Users;


public interface UsersServiceDao {
	 List<Users> getAllUsers();
	 
	 void addUsers(@Param("users")Users users);
	 
	 void updateUsers(@Param("users")Users users);
	    
	    void delUsers(@Param("users")Users users);
	    
	    List<Users> findUsersById(@RequestParam("uid") int uid);
}
