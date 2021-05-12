package com.nebula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nebula.bean.Manage;
import com.nebula.service.ManageServiceDao;

/**
 * @author Dazzling°
 * @Description
 * @create 2021-05-05 22:05
 */
@Controller
public class DengLuAction {
    @Autowired
    ManageServiceDao  manageServiceDao;
    
    @RequestMapping("/login")
    public String getLoginMess(@RequestParam("phone") String name,@RequestParam("password") String pass){
        Manage manage = new Manage();
        manage.setAdmin(name);
        manage.setPassword(pass);
        List<Manage> manage1 = manageServiceDao.getManage(manage);
        for (Manage manage2 : manage1) {
            if (manage.getAdmin().equals(manage2.getAdmin()) && manage.getPassword().equals(manage2.getPassword())){
                return "index";
            }
        }
        return "login";
    }
}
