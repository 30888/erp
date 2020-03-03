package com.neusoft.erp.Controller;

import com.neusoft.erp.Entity.Department;
import com.neusoft.erp.Mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptMapper deptMapper;

    @GetMapping("list")
    public String getAllDept(Model model, HttpSession session){

        String str = (String)session.getAttribute("abc");
        List<Department> lists = deptMapper.getAllDept();
        model.addAttribute("deps",lists);
        return "deptlist";
    }

    @GetMapping("/del/{id}")
    public String deleteDept(@PathVariable("id") Integer deptid){
        Integer i = deptMapper.deleteByid(deptid);
        return "redirect:/dept/list";    //localhost:8081/not/list
    }

    @GetMapping("add")
    public String addDept(){
        return "deptadd";  //blank.html
    }

    @PostMapping("/add")
    public String addDepInfo(Department department){
        deptMapper.addDept(department);
        return "redirect:/dept/list";
    }

}
