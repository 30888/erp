package com.neusoft.erp.Entity;

public class Department {

    private Integer Dept_id;
    private String Dept_name;
    private String Remark;
    private Integer Is_delete;

    public Integer getDept_id() {
        return Dept_id;
    }

    public void setDept_id(Integer dept_id) {
        Dept_id = dept_id;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String dept_name) {
        Dept_name = dept_name;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Integer getIs_delete() {
        return Is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        Is_delete = is_delete;
    }
}
