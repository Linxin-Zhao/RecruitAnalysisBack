package com.example.recruitback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobTypeDistribution {
    private String jobType;
    private Integer jobCount;
    private Double averageSalary;
}