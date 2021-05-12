package com.nebula.service.impl;

import com.nebula.bean.Manage;
import com.nebula.dao.ManageDao;
import com.nebula.service.ManageServiceDao;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Dazzling°
 * @Description
 * @create 2021-05-06 0:23
 */
@Component(value = "manageServiceDao")
public class ManageServiceDaoImp implements ManageServiceDao {
	@Autowired
 ManageDao manageDao;
	public List<Manage> getManage(@Param("manage")Manage manage) {
	
		// TODO Auto-generated method stub
		return manageDao.getManage(manage);
	}

    
}
