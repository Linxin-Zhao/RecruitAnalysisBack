package com.example.recruitback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryDistribution {
    private String salaryRange; // 薪资区间
    private Integer jobCount;   // 岗位数量
}