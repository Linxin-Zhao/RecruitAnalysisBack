package com.example.recruitback.mapper;

import com.example.recruitback.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface AnalysisMapper {
    
    @Select("SELECT 行业名称 as industryName, 岗位数量 as jobCount, 平均薪资 as averageSalary FROM industry_demand ORDER BY 岗位数量 DESC LIMIT 10")
    List<IndustryDemand> getTopIndustries();
    
    @Select("SELECT 薪资区间 as salaryRange, 岗位数量 as jobCount FROM salary_distribution ORDER BY 岗位数量 DESC")
    List<SalaryDistribution> getSalaryDistribution();
    
    @Select("SELECT 技能 as skill, 需求次数 as demandCount FROM skill_demand ORDER BY 需求次数 DESC LIMIT 10")
    List<SkillDemand> getTopSkills();
    
    @Select("SELECT 工作地址 as workLocation, 岗位数量 as jobCount, 平均薪资 as averageSalary FROM regional_salary ORDER BY 平均薪资 DESC LIMIT 10")
    List<RegionalSalary> getTopRegionalSalary();
    
    @Select("SELECT 学历 as education, 岗位数量 as jobCount, 平均薪资 as averageSalary FROM education_salary ORDER BY 平均薪资 DESC")
    List<EducationSalary> getEducationSalary();
    
    @Select("SELECT 工作经验 as workExperience, 岗位数量 as jobCount, 平均薪资 as averageSalary FROM experience_salary ORDER BY 平均薪资 DESC")
    List<ExperienceSalary> getExperienceSalary();
    
    @Select("SELECT 公司规模分类 as companySizeCategory, 岗位数量 as jobCount, 平均薪资 as averageSalary FROM company_size_salary ORDER BY 平均薪资 DESC")
    List<CompanySizeSalary> getCompanySizeSalary();
    
    @Select("SELECT 融资阶段 as fundingStage, 岗位数量 as jobCount, 平均薪资 as averageSalary FROM funding_salary ORDER BY 平均薪资 DESC")
    List<FundingSalary> getFundingSalary();
    
    @Select("SELECT 职位类型 as jobType, 岗位数量 as jobCount, 平均薪资 as averageSalary FROM job_type_distribution ORDER BY 岗位数量 DESC")
    List<JobTypeDistribution> getJobTypeDistribution();
    
    @Select("SELECT 发布日期 as publishDate, 岗位数量 as jobCount FROM posting_trend ORDER BY 发布日期")
    List<PostingTrend> getPostingTrend();
    
    @Select("SELECT 福利 as benefit, 提供次数 as provideCount, 提供公司数量 as companyCount FROM popular_benefits ORDER BY 提供次数 DESC LIMIT 10")
    List<PopularBenefits> getPopularBenefits();
    
    @Select("SELECT 行业名称 as industryName, 公司规模分类 as companySizeCategory, 工作经验 as workExperience, 学历 as education, 高薪岗位数量 as highSalaryJobCount, 平均薪资 as averageSalary FROM high_salary_jobs ORDER BY 平均薪资 DESC LIMIT 20")
    List<HighSalaryJobs> getHighSalaryJobs();
}