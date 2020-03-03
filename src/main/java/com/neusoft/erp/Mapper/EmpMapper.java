package com.neusoft.erp.Mapper;

import com.neusoft.erp.Entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    /**
     * 雇员登录
     * @param phone
     * @param password
     * @return
     */
    @Select("select * from oa_employee where phone=#{phone} and password=#{password}\n")
    Employee empLogin(String phone,String password);

    /**
     * 得到所有雇员信息
     * @return
     */
    @Select("select emp.*,job_name,dept_name from oa_employee emp\n" +
            "  join oa_job job on emp.job_id=job.job_id\n" +
            "  join oa_department dept on emp.dept_id=dept.dept_id")
    List<Employee> getAllEmp();

    @Delete("delete oa_employee where Emp_id=#{empid}")
    Integer deleteByid(Integer empid);

    @Insert("insert into oa_employee (Dept_id,Job_id,Emp_name,Card_id,Address,Qq,Phone,Email,Sex,Birthday,Education,Speciality,Race,Remark,Create_date,EmpState)\n" +
            "  values(#{Dept_id},#{Job_id},#{Emp_name},#{Card_id},#{Address},#{Qq},#{Phone},#{Email},#{Sex},#{Birthday},#{Education},#{Speciality},#{Race},#{Remark},getdate(),#{EmpState})\n")
    Integer addEmp(Employee employee);
    @Select("select Emp_id,Emp_name,Sex,Dept_name,Job_name,Salary,Phone from oa_employee emp join oa_department dept on emp.Dept_id = dept.Dept_id join oa_job job on emp.Job_id = job.Job_id where Emp_id=#{eid}\n")
    List<Employee> geteinfByid(Integer eid);
}
