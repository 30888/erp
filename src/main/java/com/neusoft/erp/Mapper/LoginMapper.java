package com.neusoft.erp.Mapper;

import com.neusoft.erp.Entity.Login;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import sun.rmi.runtime.Log;

import java.util.List;

@Mapper
public interface LoginMapper {

    @Select("select * from dbo.sys_login_log\n")
    List<Login> getAllLog();

    @Insert("insert into sys_login_log(user_id,ip,login_time,user_type) \n" +
            "                 values(#{user_id},#{ip},getDate(),#{user_type})")
    Integer addLog(Login log);

    @Select("select u.user_name,lg.* from sys_login_log lg join Oa_user u on lg.user_id = u.user_id\n" +
            "  where lg.user_type=1\n" +
            "union\n" +
            "select emp.emp_name as user_name,lg.* from sys_login_log lg join Oa_employee emp on lg.user_id = emp.emp_id\n" +
            "  where lg.user_type=0\n")
    List<Login> getAllLogn();
    @Select("select User_name,lg.User_id,Ip,Login_time from sys_login_log lg join oa_user u on lg.User_id=u.User_id where lg.User_type=1\n" +
            "union\n" +
            "select emp.Emp_name as User_name,lg.User_id,Ip,Login_time from sys_login_log lg join oa_employee emp on lg.User_id=emp.Emp_id where lg.User_type=0")
    List<Login> getElog();

    @Select("select emp.emp_name as user_name,lg.* from sys_login_log lg join Oa_employee emp on lg.user_id = emp.emp_id\n" +
            "  where lg.user_type=0 and user_id=#{uid}")
    List<Login> getLogByID(Integer uid);
    @Delete("delete sys_login_log where Id = #{logid}")
    Integer deleteByid(Integer log);
}
