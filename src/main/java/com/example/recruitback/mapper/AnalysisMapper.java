package com.example.recruitback.mapper;

import com.example.recruitback.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnalysisMapper {
    
    @Select("SELECT * FROM industry_demand ORDER BY 岗位数量 DESC LIMIT 20")
    List<IndustryDemand> getTopIndustries();
    
    @Select("SELECT * FROM salary_distribution ORDER BY 岗位数量 DESC")
    List<SalaryDistribution> getSalaryDistribution();
    
    @Select("SELECT * FROM skill_demand ORDER BY 需求次数 DESC LIMIT 30")
    List<SkillDemand> getTopSkills();
    
    @Select("SELECT * FROM regional_salary ORDER BY 平均薪资 DESC LIMIT 50")
    List<RegionalSalary> getTopRegionalSalary();
    
    @Select("SELECT * FROM education_salary ORDER BY 平均薪资 DESC")
    List<EducationSalary> getEducationSalary();
    
    @Select("SELECT * FROM experience_salary ORDER BY 平均薪资 DESC")
    List<ExperienceSalary> getExperienceSalary();
    
    @Select("SELECT * FROM company_size_salary ORDER BY 平均薪资 DESC")
    List<CompanySizeSalary> getCompanySizeSalary();
    
    @Select("SELECT * FROM funding_salary ORDER BY 平均薪资 DESC")
    List<FundingSalary> getFundingSalary();
    
    @Select("SELECT * FROM job_type_distribution ORDER BY 岗位数量 DESC LIMIT 20")
    List<JobTypeDistribution> getJobTypeDistribution();
    
    @Select("SELECT * FROM posting_trend ORDER BY 发布日期 DESC LIMIT 100")
    List<PostingTrend> getPostingTrend();
    
    @Select("SELECT * FROM popular_benefits ORDER BY 提供次数 DESC LIMIT 20")
    List<PopularBenefits> getPopularBenefits();
    
    @Select("SELECT * FROM high_salary_jobs ORDER BY 高薪岗位数量 DESC LIMIT 30")
    List<HighSalaryJobs> getHighSalaryJobs();
}