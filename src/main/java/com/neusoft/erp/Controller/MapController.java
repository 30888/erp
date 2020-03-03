package com.neusoft.erp.Controller;

import com.neusoft.erp.Entity.Employee;
import com.neusoft.erp.Entity.Login;
import com.neusoft.erp.Entity.Notice;
import com.neusoft.erp.Entity.OaUser;
import com.neusoft.erp.Mapper.EmpMapper;
import com.neusoft.erp.Mapper.LoginMapper;
import com.neusoft.erp.Mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MapController {
    @GetMapping("/")
    public String index(){
        return "login";
    }
    @GetMapping("login")
    public String Login(){
        return "login";
    }

    @GetMapping("ehome")
    public String ehome(){
        return "" +
                "ehome";
    }
    @GetMapping("enoticeshow")
    public String showNotice(){
        return "enoticeshow";
    }
    //员工个人信息数据
    @Autowired
    private EmpMapper empMapper;
    @GetMapping("einf")
    public String GetEinf(Model model,
                          HttpSession session) {
        Employee employee = (Employee)session.getAttribute("empSession");
        List<Employee> einfs = empMapper.geteinfByid(employee.getEmp_id());
        model.addAttribute("einf", einfs);
        return "einf";
    }

    //公告数据
    @Autowired
    private NoticeMapper noMapper;
    @GetMapping("enotice")
    private String GetAllEnotice(Model model){
        List<Notice> enotices = noMapper.getAllEno();
        model.addAttribute("enotice",enotices);
        return "enotice";
    }
    //  //个人登录日志数据
    @Autowired
    private LoginMapper loginMapper;
    @GetMapping("elog")
    private String GetElog(Model model,
                           HttpSession session){
        Employee employee = (Employee) session.getAttribute("empSession");
        List<Login> lgo = loginMapper.getLogByID(employee.getEmp_id());
        model.addAttribute("elog",lgo);
        return "elog";

    }
//    @Autowired
////    userSession.
////    private NoticeMapper noticeMapper;
////    private String GetNotices(Model model,
////                              HttpSession session){
////        OaUser oaUser = (OaUser)session.getAttribute("userSession");
////        List<Notice> gg = noMapper
////    }



}
