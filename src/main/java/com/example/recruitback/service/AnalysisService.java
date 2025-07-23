package com.example.recruitback.service;

import com.example.recruitback.pojo.*;
import java.util.List;

public interface AnalysisService {
    List<IndustryDemand> getTopIndustries();
    List<SalaryDistribution> getSalaryDistribution();
    List<SkillDemand> getTopSkills();
    List<RegionalSalary> getTopRegionalSalary();
    List<EducationSalary> getEducationSalary();
    List<ExperienceSalary> getExperienceSalary();
    List<CompanySizeSalary> getCompanySizeSalary();
    List<FundingSalary> getFundingSalary();
    List<JobTypeDistribution> getJobTypeDistribution();
    List<PostingTrend> getPostingTrend();
    List<PopularBenefits> getPopularBenefits();
    List<HighSalaryJobs> getHighSalaryJobs();
}