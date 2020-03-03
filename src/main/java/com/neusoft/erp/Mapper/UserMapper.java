package com.neusoft.erp.Mapper;

import com.neusoft.erp.Entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from dbo.oa_user\n")
    List<User> getALLUse();

    @Delete("delete oa_user where User_id=#{userid}")
    Integer deleteByid(Integer userid);

    @Insert("insert into oa_user (Account,User_name,Password,Status,Role_name)\n" +
            "  values(#{Account},#{User_name},#{Password},#{Status},#{Role_name})")
    Integer addUser(User user);
}
