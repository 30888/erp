package com.neusoft.erp.Controller;

import com.neusoft.erp.Entity.*;
import com.neusoft.erp.Mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private OaUserMapper userMapper;

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private JobMapper jobMapper;

    @Autowired
    private DeptMapper deptMapper;

    @GetMapping("/list")
    public String getAllEmp(Model model) {
        List<Employee> lists = empMapper.getAllEmp();
        model.addAttribute("emps", lists);
        return "emplist";
    }

    @GetMapping("/listt")
    public String getAllEmpp(Model model) {
        List<Employee> lists = empMapper.getAllEmp();
        model.addAttribute("emps", lists);
        return "empplist";
    }
//     @Autowired
//     private EmpMapper empMapper;
//     @GetMapping("/listt")
//
//    public String GetAllEmpp(Model model,
//                             HttpSession session) {
//        Employee employee = (Employee)session.getAttribute("empSession");
//        List<Employee> empp = empMapper.geteinfByid(employee.getEmp_id());
//        model.addAttribute("listt", empp);
//        return "listt";
//    }


    @GetMapping("/del/{id}")
    public String deleteEmp(@PathVariable("id") Integer empid) {
        Integer i = empMapper.deleteByid(empid);
        return "redirect:/emp/list";    //localhost:8081/not/list
    }

    @GetMapping("add")
    public String addEmp(Model model) {
        List<Job>jobLists = jobMapper.getAllJob();
        List<Department>departLists = deptMapper.getAllDept();
        model.addAttribute("jobs",jobLists);
        model.addAttribute("depts",departLists);
        return "empadd";
    }

    @PostMapping("/add")
    public String addEmpInfo(Employee employee) {
        empMapper.addEmp(employee);
        return "redirect:/emp/list";
    }

    @GetMapping("/login")
    public String userlogin() {
        return "login";  //blank.html
    }

    @PostMapping("/login")
    private String userLoginInfo(@RequestParam("userName") String uName,
                                 @RequestParam("password") String password,
                                 @RequestParam("power") String power,
                                 HttpSession session) {
        session.setAttribute("abc","hello 2019!");
        if (power.equals("1")) {  //管理员
            OaUser oaUser = userMapper.userLogin(uName, password);
            if (oaUser == null) {
                return "redirect:/emp/login";
            }

            //实现管理员的登录日志
            Login log = new Login();
            log.setUser_id(oaUser.getUser_id());
            log.setIp("127.0.0.1");
            log.setUser_type(1);

            Integer i = loginMapper.addLog(log);
            session.setAttribute("userSession",oaUser);
            return "redirect:/user/list";
        } else {   //雇员 power:0
            Employee employee = empMapper.empLogin(uName, password);
            if (employee == null) {
                return "redirect:/emp/login";
            }

            //实现雇员的登录日志
            Login log = new Login();
            log.setUser_id(employee.getEmp_id());
            log.setIp("127.0.0.1");
            log.setUser_type(0);
            Integer i = loginMapper.addLog(log);
            session.setAttribute("empSession",employee);
            return "redirect:/ehome";
        }
    }
}