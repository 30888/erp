package com.neusoft.erp.Entity;

import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties;

import java.util.Date;

public class Employee {
    private Integer Emp_id;
    private Integer Dept_id;
    private Integer Job_id;
    private String Emp_name;
    private String Card_id;
    private String Address;
    private String Qq;
    private String Phone;
    private String Email;
    private Character Sex;
    private String Birthday;
    private String Education;
    private String Speciality;
    private String Race;
    private String Remark;
    private Date Create_date;
    private Integer EmpState;
    private String Job_name;
    private String Dept_name;
    private Float Salary;

    public Integer getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        Emp_id = emp_id;
    }

    public Integer getDept_id() {
        return Dept_id;
    }

    public void setDept_id(Integer dept_id) {
        Dept_id = dept_id;
    }

    public Integer getJob_id() {
        return Job_id;
    }

    public void setJob_id(Integer job_id) {
        Job_id = job_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public String getCard_id() {
        return Card_id;
    }

    public void setCard_id(String card_id) {
        Card_id = card_id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getQq() {
        return Qq;
    }

    public void setQq(String qq) {
        Qq = qq;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Character getSex() {
        return Sex;
    }

    public void setSex(Character sex) {
        Sex = sex;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Date getCreate_date() {
        return Create_date;
    }

    public void setCreate_date(Date create_date) {
        Create_date = create_date;
    }

    public Integer getEmpState() {
        return EmpState;
    }

    public void setEmpState(Integer empState) {
        EmpState = empState;
    }

    public String getJob_name() {
        return Job_name;
    }

    public void setJob_name(String job_name) {
        Job_name = job_name;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String dept_name) {
        Dept_name = dept_name;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float salary) {
        Salary = salary;
    }
}

