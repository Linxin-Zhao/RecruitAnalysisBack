package com.example.recruitback.controller;

import com.example.recruitback.pojo.*;
import com.example.recruitback.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 表示该类是一个 RESTful API 控制器
@RequestMapping("/api/analysis") // 表示该控制器处理请求的路径
@CrossOrigin(origins = "*")  // 允许所有源的请求
public class AnalysisController {
    
    @Autowired // 表示自动注入，创建该类实例时，会自动将依赖的 Service 注入进来
    private AnalysisService analysisService; // 表示该控制器调用的 Service
    
    @GetMapping("/industries")  // 表示该方法处理 GET 请求
    public List<IndustryDemand> getTopIndustries() {
        return analysisService.getTopIndustries();
    }  // 获取行业需求
    
    @GetMapping("/salary-distribution")
    public List<SalaryDistribution> getSalaryDistribution() {
        return analysisService.getSalaryDistribution();
    }
    
    @GetMapping("/skills")
    public List<SkillDemand> getTopSkills() {
        return analysisService.getTopSkills();
    }
    
    @GetMapping("/regional-salary")
    public List<RegionalSalary> getTopRegionalSalary() {
        return analysisService.getTopRegionalSalary();
    }
    
    @GetMapping("/education-salary")
    public List<EducationSalary> getEducationSalary() {
        return analysisService.getEducationSalary();
    }
    
    @GetMapping("/experience-salary")
    public List<ExperienceSalary> getExperienceSalary() {
        return analysisService.getExperienceSalary();
    }
    
    @GetMapping("/company-size-salary")
    public List<CompanySizeSalary> getCompanySizeSalary() {
        return analysisService.getCompanySizeSalary();
    }
    
    @GetMapping("/funding-salary")
    public List<FundingSalary> getFundingSalary() {
        return analysisService.getFundingSalary();
    }
    
    @GetMapping("/job-type-distribution")
    public List<JobTypeDistribution> getJobTypeDistribution() {
        return analysisService.getJobTypeDistribution();
    }
    
    @GetMapping("/posting-trend")
    public List<PostingTrend> getPostingTrend() {
        return analysisService.getPostingTrend();
    }
    
    @GetMapping("/popular-benefits")
    public List<PopularBenefits> getPopularBenefits() {
        return analysisService.getPopularBenefits();
    }
    
    @GetMapping("/high-salary-jobs")
    public List<HighSalaryJobs> getHighSalaryJobs() {
        return analysisService.getHighSalaryJobs();
    }
}