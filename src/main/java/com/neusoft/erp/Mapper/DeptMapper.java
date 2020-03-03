package com.neusoft.erp.Mapper;

import com.neusoft.erp.Entity.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("select * from dbo.oa_department\n")
    List<Department> getAllDept();

    @Delete("delete oa_department where Dept_id=#{deptid}")
    Integer deleteByid(Integer deptid);

    @Insert("insert into oa_department (Dept_name,Remark,Is_delete)\n" +
            "  values(#{Dept_name},#{Remark},#{Is_delete})\n")
    Integer addDept(Department department);
}
