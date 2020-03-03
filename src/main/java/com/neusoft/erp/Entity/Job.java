package com.neusoft.erp.Entity;

public class Job {

    private Integer Job_id;
    private String Job_name;
    private String remark;
    private Float Salary;

    public Integer getJob_id() {
        return Job_id;
    }

    public void setJob_id(Integer job_id) {
        Job_id = job_id;
    }

    public String getJob_name() {
        return Job_name;
    }

    public void setJob_name(String job_name) {
        Job_name = job_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float salary) {
        Salary = salary;
    }
}
