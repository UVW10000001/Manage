package com.nebula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nebula.bean.Users;
import com.nebula.service.UsersServiceDao;

@Controller
public class UsersAction {

	@Autowired
	UsersServiceDao usersServiceDao;
	
	@RequestMapping("/updateUsers")
	public String insertUser(@RequestParam("username") String username,@RequestParam("phone") String phone) {
		Users users = new Users();
		users.setUname(username);
		users.setUpassword(phone);
		usersServiceDao.addUsers(users);
		return "u_su";
	}
	
	@RequestMapping("/allUsers")
    public ModelAndView getAllUsers(){
		List<Users> allStudent = usersServiceDao.getAllUsers();
		ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("allUsers",allStudent);
		 modelAndView.setViewName("user_list");
		 return modelAndView;
	}
	
	@RequestMapping("/delUsers")
	public String delUsers(@RequestParam("uid") int uid) {
		Users users = new Users();
		users.setUid(uid);
		usersServiceDao.delUsers(users);
		return "user_remove";
		
	}
	
	@RequestMapping("/upUsers")
	public String upateUser(@RequestParam("uid") int uid,@RequestParam("username") String username,@RequestParam("phone") String phone) {
		Users users = new Users();
		users.setUid(uid);
		users.setUname(username);
		users.setUpassword(phone);
		usersServiceDao.updateUsers(users);
		return "u_su";
		
	}
	
	
	@RequestMapping("/findUsersById")
	public ModelAndView findUsersById(@RequestParam("uid") int uid) {
		List<Users> findUsersById = usersServiceDao.findUsersById(uid);
		ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("findUsersById",findUsersById);
		 modelAndView.setViewName("user_update");
		return modelAndView;
		
	}
}
