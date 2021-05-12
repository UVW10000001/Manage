package com.nebula.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nebula.bean.Orders;
import com.nebula.dao.OrdersDao;
import com.nebula.service.OrdersServiceDao;

@Component(value = "ordersServiceDao")
public class OrdersServiceDaoImpl implements OrdersServiceDao{

	@Autowired
	OrdersDao ordersDao;
	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return ordersDao.getAllOrders();
	}
	@Override
	public void addOrders(@Param("orders")Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.addOrders(orders);
	}
	@Override
	public void delOrders(@Param("orders")Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.delOrders(orders);
	}
	@Override
	public void updateOrders(@Param("orders")Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.updateOrders(orders);
	}
	@Override
	public List<Orders> findOrdersById(@Param("pid")int pid) {
		// TODO Auto-generated method stub
		return ordersDao.findOrdersById(pid);
	}

}
