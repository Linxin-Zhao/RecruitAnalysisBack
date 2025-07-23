package com.example.recruitback.service.implementation;

import com.example.recruitback.mapper.AnalysisMapper;
import com.example.recruitback.pojo.*;
import com.example.recruitback.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisServiceImpl implements AnalysisService {
    
    @Autowired
    private AnalysisMapper analysisMapper;
    
    @Override
    public List<IndustryDemand> getTopIndustries() {
        return analysisMapper.getTopIndustries();
    }
    
    @Override
    public List<SalaryDistribution> getSalaryDistribution() {
        return analysisMapper.getSalaryDistribution();
    }
    
    @Override
    public List<SkillDemand> getTopSkills() {
        return analysisMapper.getTopSkills();
    }
    
    @Override
    public List<RegionalSalary> getTopRegionalSalary() {
        return analysisMapper.getTopRegionalSalary();
    }
    
    @Override
    public List<EducationSalary> getEducationSalary() {
        return analysisMapper.getEducationSalary();
    }
    
    @Override
    public List<ExperienceSalary> getExperienceSalary() {
        return analysisMapper.getExperienceSalary();
    }
    
    @Override
    public List<CompanySizeSalary> getCompanySizeSalary() {
        return analysisMapper.getCompanySizeSalary();
    }
    
    @Override
    public List<FundingSalary> getFundingSalary() {
        return analysisMapper.getFundingSalary();
    }
    
    @Override
    public List<JobTypeDistribution> getJobTypeDistribution() {
        return analysisMapper.getJobTypeDistribution();
    }
    
    @Override
    public List<PostingTrend> getPostingTrend() {
        return analysisMapper.getPostingTrend();
    }
    
    @Override
    public List<PopularBenefits> getPopularBenefits() {
        return analysisMapper.getPopularBenefits();
    }
    
    @Override
    public List<HighSalaryJobs> getHighSalaryJobs() {
        return analysisMapper.getHighSalaryJobs();
    }
}