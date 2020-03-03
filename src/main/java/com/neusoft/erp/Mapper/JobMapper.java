package com.neusoft.erp.Mapper;

import com.neusoft.erp.Entity.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface JobMapper {
    @Select("select * from dbo.oa_job\n")
    List<Job> getAllJob();

    @Delete("delete oa_job where Job_id=#{jobid}")
    Integer deleteByid(Integer jobid);

    @Insert("insert into oa_job(Job_name,remark,Salary)\n" +
            "             values(#{Job_name},#{remark},#{Salary})")
    Integer addjob(Job job);


}
