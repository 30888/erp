package com.neusoft.erp.Entity;

import java.util.Date;

public class Login {

    private Integer Id;
    private Integer User_id;
    private String Ip;
    private Date Login_time;
    private Integer User_type;
    private String User_name;
    private String Emp_name;

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUser_id() {
        return User_id;
    }

    public void setUser_id(Integer user_id) {
        User_id = user_id;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public Date getLogin_time() {
        return Login_time;
    }

    public void setLogin_time(Date login_time) {
        Login_time = login_time;
    }

    public Integer getUser_type() {
        return User_type;
    }

    public void setUser_type(Integer user_type) {
        User_type = user_type;
    }
}
