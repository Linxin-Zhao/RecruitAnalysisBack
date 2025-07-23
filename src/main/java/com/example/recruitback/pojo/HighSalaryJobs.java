package com.example.recruitback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HighSalaryJobs {
    private String industryName;        // 行业名称
    private String companySizeCategory; // 公司规模分类
    private String workExperience;      // 工作经验
    private String education;           // 学历
    private Integer highSalaryJobCount; // 高薪岗位数量
    private Double averageSalary;       // 平均薪资
}