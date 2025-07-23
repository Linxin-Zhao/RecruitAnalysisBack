package com.example.recruitback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanySizeSalary {
    private String companySizeCategory;
    private Integer jobCount;
    private Double averageSalary;
}