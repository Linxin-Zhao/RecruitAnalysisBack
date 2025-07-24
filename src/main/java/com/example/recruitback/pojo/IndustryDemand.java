package com.example.recruitback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 表示该类有数据成员变量
@AllArgsConstructor // 表示该类有全参构造函数
@NoArgsConstructor // 示该类有无参构造函数
public class IndustryDemand {
    private String industryName; // 行业名称
    private Integer jobCount;  // 岗位数量
    private Double averageSalary;  // 平均薪资
}

