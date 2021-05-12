package com.nebula.dao;

import com.nebula.bean.Manage;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Dazzling°
 * @Description
 * @create 2021-05-04 2:02
 */
public interface ManageDao {
    List<Manage> getManage(@Param("manage")Manage manage);
}
