package com.nebula.dao;

import com.nebula.bean.Orders;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Dazzling°
 * @Description
 * @create 2021-05-04 2:04
 */
public interface OrdersDao {
    List<Orders> getAllOrders();
    
    void addOrders(@Param("orders")Orders orders);
    
    void delOrders(@Param("orders")Orders orders);
    
    void updateOrders(@Param("orders")Orders orders);
    
    List<Orders> findOrdersById(@RequestParam("pid")int pid);
}
