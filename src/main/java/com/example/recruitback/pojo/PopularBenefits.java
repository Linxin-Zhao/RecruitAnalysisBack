package com.example.recruitback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PopularBenefits {
    private String benefit;
    private Integer provideCount;
    private Integer companyCount;
}