package com.dgmf.service;

import com.dgmf.dto.JobDtoResponse;

import java.util.List;

public interface JobService {
    List<JobDtoResponse> getAllJobs();
}
