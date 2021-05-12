package com.nebula.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.nebula.bean.Orders;

public interface OrdersServiceDao {

	 List<Orders> getAllOrders();
	 
	 void addOrders(@Param("orders")Orders orders);
	    
	    void delOrders(@Param("orders")Orders orders);
	    
	    void updateOrders(@Param("orders")Orders orders);
	    
	    List<Orders> findOrdersById(@RequestParam("pid")int pid);
}
