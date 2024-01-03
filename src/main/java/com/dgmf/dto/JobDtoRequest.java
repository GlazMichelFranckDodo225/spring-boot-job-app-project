package com.dgmf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class JobDtoRequest {
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
}
