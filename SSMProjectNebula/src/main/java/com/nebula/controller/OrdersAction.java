package com.nebula.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nebula.bean.Orders;
import com.nebula.service.OrdersServiceDao;

@Controller
public class OrdersAction {

	@Autowired
	OrdersServiceDao ordersServiceDao;
	@RequestMapping("/allOrders")
    public ModelAndView getAllOrders(){
		List<Orders> allOrders = ordersServiceDao.getAllOrders();
		ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("allOrders",allOrders);
		 modelAndView.setViewName("order_list");
		return modelAndView;
		
	}
	
	@RequestMapping("/delOrders")
    public String delOrders(@RequestParam("pid")int pid){
		Orders orders = new Orders();
		orders.setPid(pid);
		ordersServiceDao.delOrders(orders);
		return "order_remove";
	}
	
	@RequestMapping("/insterOrders")
    public String insterOrders(@RequestParam("username")String username,@RequestParam("phone")String phone,@RequestParam("petname")String petname,@RequestParam("combo")String combo,@RequestParam("date")String date){
		System.out.println(date);
		Orders orders = new Orders();
		orders.setUsername(username);
		orders.setPhone(phone);
		orders.setPetname(petname);
		orders.setCombo(combo);
		orders.setDate(date);
		ordersServiceDao.addOrders(orders);
		return "o_su";
		
	}
	
	@RequestMapping("/updateOrders")
    public String updateOrders(@RequestParam("pid")int pid,@RequestParam("username")String username ,@RequestParam("phone")String phone,@RequestParam("petname")String petname,@RequestParam("combo")String combo,@RequestParam("date")String date){
		Orders orders = new Orders();
			orders.setPhone(phone);
			orders.setPetname(petname);
			orders.setCombo(combo);
			orders.setDate(date);
			orders.setUsername(username);
			orders.setPid(pid);
			ordersServiceDao.updateOrders(orders);
		
		return "o_su";
		
	}
	@RequestMapping("/findOrdersById")
    public ModelAndView findOrdersById(@RequestParam("pid")int pid){
		List<Orders> findOrdersById = ordersServiceDao.findOrdersById(pid);
		ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("findOrdersById",findOrdersById);
		 modelAndView.setViewName("order_update");
		return modelAndView;
		
	}
	
}
