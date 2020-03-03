package com.neusoft.erp.Mapper;

import com.neusoft.erp.Entity.OaUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OaUserMapper {

    /**
     * 管理员登录
     * @param username
     * @param password
     * @return
     */
    @Select("select * from oa_user where user_name=#{username} and password=#{password}\n")
    OaUser userLogin(String username, String password);
}
