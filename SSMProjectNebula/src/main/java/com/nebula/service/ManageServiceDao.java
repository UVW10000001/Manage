package com.nebula.service;

import com.nebula.bean.Manage;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Dazzling°
 * @Description
 * @create 2021-05-06 0:22
 */
public interface ManageServiceDao {
    List<Manage> getManage(@Param("manage")Manage manage);
}
