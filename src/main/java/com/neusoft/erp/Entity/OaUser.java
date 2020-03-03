package com.neusoft.erp.Entity;

public class OaUser {

    private Integer User_id;
    private String Account;
    private String User_name;
    private String Password;
    private Integer Status;
    private String Role_name;

    public Integer getUser_id() {
        return User_id;
    }

    public void setUser_id(Integer user_id) {
        User_id = user_id;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getRole_name() {
        return Role_name;
    }

    public void setRole_name(String role_name) {
        Role_name = role_name;
    }
}
