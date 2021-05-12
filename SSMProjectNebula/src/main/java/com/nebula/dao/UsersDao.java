package com.nebula.dao;

import com.nebula.bean.Users;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Dazzling°
 * @Description
 * @create 2021-05-04 2:00
 */
public interface UsersDao {
    List<Users> getAllUsers();
    
    void addUsers(@Param("users")Users users);
    
    void updateUsers(@Param("users")Users users);
    
    void delUsers(@Param("users")Users users);
    
    List<Users> findUsersById(@RequestParam("uid") int uid);
    
}
