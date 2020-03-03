package com.neusoft.erp.Controller;

import com.neusoft.erp.Entity.Employee;
import com.neusoft.erp.Entity.Login;
import com.neusoft.erp.Mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.rmi.MarshalledObject;
import java.util.List;

@Controller
@RequestMapping("log")
public class LoginController {
    @Autowired
    private LoginMapper loginMapper;
    @GetMapping("/emplog")
    private String getEmpLog(Model model,
                             HttpSession session){
        Employee employee = (Employee)session.getAttribute("empSession");
        List<Login> lg= loginMapper.getLogByID(employee.getEmp_id());
        model.addAttribute("log",lg);
        return "loginlist";
    }

    @GetMapping("list")
    public String getAllLog(Model model){
        List<Login> lists = loginMapper.getAllLog();
        model.addAttribute("logs",lists);
        return "loginlist";
    }
    @GetMapping("/del/{id}")
    public String deleteNotice(@PathVariable("id") Integer logid){
        Integer i = loginMapper.deleteByid(logid);
        return "redirect:/log/list";
    }

}
