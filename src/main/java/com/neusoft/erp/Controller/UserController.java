package com.neusoft.erp.Controller;

import com.neusoft.erp.Entity.User;
import com.neusoft.erp.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("list")
    public String getAllUser(Model model){
        List<User> lists = userMapper.getALLUse();
        model.addAttribute("uses",lists);
        return "userlist";
    }
    @GetMapping("/del/{id}")
    public String deleteUser(@PathVariable("id") Integer userid){
        Integer i = userMapper.deleteByid(userid);
        return "redirect:/user/list";
    }

    @GetMapping("add")
    public String addUser(){
        return "useradd";
    }

    @PostMapping("/add")
    public String addUseInfo(User user){
        userMapper.addUser(user);
        return "redirect:/user/list";
    }

    @GetMapping("grxx")
    public String getAllDr(Model model) {
        List<User> lists = userMapper.getALLUse();
        model.addAttribute("uses", lists);
        return "grxxlist";
    }

}
