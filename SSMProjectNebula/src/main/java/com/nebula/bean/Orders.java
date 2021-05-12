package com.nebula.bean;

import java.util.Date;

/**
 * @author Dazzling°
 * @Description
 * @create 2021-05-04 1:56
 */
public class Orders {
    private int pid;
    private String username;
    private String phone;
    private String petname;
    private String date;
    private String combo;

    @Override
    public String toString() {
        return "orders{" +
                "pid=" + pid +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", petname='" + petname + '\'' +
                ", date='" + date + '\'' +
                ", combo='" + combo + '\'' +
                '}';
    }

    
    public Orders(int pid, String username, String phone, String petname, String date, String combo) {
		super();
		this.pid = pid;
		this.username = username;
		this.phone = phone;
		this.petname = petname;
		this.date = date;
		this.combo = combo;
	}


	


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Orders() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPetname() {
		return petname;
	}


	public void setPetname(String petname) {
		this.petname = petname;
	}


	public String getCombo() {
		return combo;
	}


	public void setCombo(String combo) {
		this.combo = combo;
	}



  
}
