package com.neusoft.erp.Mapper;

import com.neusoft.erp.Entity.Notice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoticeMapper {

    @Select("select * from oa_notice")
    List<Notice> getAllNot();

    @Delete("delete oa_notice where Notice_id=#{noticeid}")
    Integer deleteByid(Integer noticeid);

    @Insert("insert into oa_notice (Title,Content,Create_time,User_id)\n" +
            "  values(#{Title},#{Content},getdate(),#{User_id})")
    Integer addNoti(Notice notice);

    Integer addNo(Notice notice);
    @Select("select Title,Content,Create_time,User_name from oa_notice notice join oa_user us on notice.User_id=us.User_id")
    List<Notice> getAllEno();



}
