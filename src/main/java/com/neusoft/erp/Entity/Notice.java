package com.neusoft.erp.Entity;

import java.util.Date;

public class Notice {

    private Integer Notice_id;
    private String Title;
    private String Content;
    private Date Create_time;
    private Integer User_id;
    private String User_name;

    public Integer getNotice_id() {
        return Notice_id;
    }

    public void setNotice_id(Integer notice_id) {
        Notice_id = notice_id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getCreate_time() {
        return Create_time;
    }

    public void setCreate_time(Date create_time) {
        Create_time = create_time;
    }

    public Integer getUser_id() {
        return User_id;
    }

    public void setUser_id(Integer user_id) {
        User_id = user_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }
}
