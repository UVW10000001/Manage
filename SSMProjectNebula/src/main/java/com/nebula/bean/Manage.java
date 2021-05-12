package com.nebula.bean;

/**
 * @author Dazzling°
 * @Description
 * @create 2021-05-04 1:54
 */
public class Manage {
    private int id;
    private String admin;
    private String password;

    @Override
    public String toString() {
        return "manage{" +
                "id=" + id +
                ", admin='" + admin + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Manage() {
    }

    public Manage(int id, String admin, String password) {
        this.id = id;
        this.admin = admin;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
