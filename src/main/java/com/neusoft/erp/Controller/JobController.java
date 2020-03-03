package com.neusoft.erp.Controller;

import com.neusoft.erp.Entity.Job;
import com.neusoft.erp.Mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("job")
public class JobController {
    @Autowired
    private JobMapper jobMapper;

    @GetMapping("list")
    public String getAllJobs(Model model){
        List<Job> list = jobMapper.getAllJob();
        model.addAttribute("jobs",list);
        return "joblist";
    }
    @GetMapping("/del/{id}")
    public String deleteJob(@PathVariable("id") Integer jobid){
        Integer i = jobMapper.deleteByid(jobid);
        return "redirect:/job/list";
    }

    @GetMapping("add")
    public String addJobs(){
        return "jobadd";
    }

    @PostMapping("/add")
    public String addJobInfo(Job job){
        jobMapper.addjob(job);
        return "redirect:/job/list";
    }

}
