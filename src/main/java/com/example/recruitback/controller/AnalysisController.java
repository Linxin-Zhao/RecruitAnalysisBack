package com.example.recruitback.controller;

import com.example.recruitback.pojo.*;
import com.example.recruitback.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/analysis")
@CrossOrigin(origins = "*")
public class AnalysisController {
    
    @Autowired
    private AnalysisService analysisService;
    
    @GetMapping("/industries")
    public List<IndustryDemand> getTopIndustries() {
        return analysisService.getTopIndustries();
    }
    
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