package com.neusoft.erp.Controller;

import com.neusoft.erp.Entity.Notice;
import com.neusoft.erp.Entity.User;
import com.neusoft.erp.Mapper.NoticeMapper;
import com.neusoft.erp.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("not")
public class NoticeController {

    @Autowired
    private NoticeMapper noticeMapper;

    @Autowired
    private UserMapper userMapper;

//    @GetMapping("/list")
//    public List<Notice> getAll(){
//        List<Notice> list = noticeMapper.getAllNot();
//        return list;
//    }

//    @GetMapping("abc")
//    public String getBlank(){
//       return "blank";  //blank.html
//    }

    @GetMapping("list")
    public String getAllNotice(Model model){
        List<Notice> lists = noticeMapper.getAllNot();
//        String str = "hello Springboot!";
//        Notice not = new Notice();
//        model.addAttribute("mystr",str);
        model.addAttribute("nots",lists);
        return "noticelist";  //blank.html

    }

    @GetMapping("lists")
    public String getAllNoticeXq(Model model){
        List<Notice> lists = noticeMapper.getAllNot();
        model.addAttribute("notsxq",lists);
        return "noticelistxq";  //blank.html

    }


    @GetMapping("/del/{id}")
    public String deleteNot(@PathVariable("id") Integer noticeid){
        Integer i = noticeMapper.deleteByid(noticeid);
        return "redirect:/not/list";    //localhost:8081/not/list
    }

//    @GetMapping("list")
//    public String getAllNotice(){
//        return "noticelist";  //blank.html
//    }

    @GetMapping("add")
    public String addNotice(Model model){
        List<User>uses = userMapper.getALLUse();
        model.addAttribute("us",uses);
        return "noticeadd";  //blank.html
    }

    @PostMapping("/add")
    public String addNotInfo(Notice notice){
        noticeMapper.addNoti(notice);
        return "redirect:/not/list";
    }
    @GetMapping("update")
    public String updateNotice(){
        return "noticeupdate";  //blank.html
    }
}
