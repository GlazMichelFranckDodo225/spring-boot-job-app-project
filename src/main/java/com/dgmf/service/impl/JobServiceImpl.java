package com.dgmf.service.impl;

import com.dgmf.dto.JobDtoResponse;
import com.dgmf.entity.Job;
import com.dgmf.mapper.JobMapper;
import com.dgmf.repository.JobRepository;
import com.dgmf.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {
    private final JobRepository jobRepository;
    private final JobMapper jobMapper;

    @Override
    public List<JobDtoResponse> getAllJobs() {
        List<Job> jobs = jobRepository.findAll();
        List<JobDtoResponse> jobDtoResponses = jobs.stream()
                .map(job -> jobMapper.mapToJobDtoResponse(job))
                .collect(Collectors.toList());

        return jobDtoResponses;
    }
}
