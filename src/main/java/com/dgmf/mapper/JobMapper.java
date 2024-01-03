package com.dgmf.mapper;

import com.dgmf.dto.JobDtoRequest;
import com.dgmf.dto.JobDtoResponse;
import com.dgmf.entity.Job;
import org.springframework.stereotype.Component;

@Component
public class JobMapper {
    public JobDtoResponse mapToJobDtoResponse(Job job) {
        JobDtoResponse jobDtoResponse = JobDtoResponse.builder()
                .id(job.getId())
                .title(job.getTitle())
                .description(job.getDescription())
                .minSalary(job.getMinSalary())
                .maxSalary(job.getMaxSalary())
                .location(job.getLocation())
                .build();

        return jobDtoResponse;
    }

    public Job mapToJob(JobDtoRequest jobDtoRequest) {
        Job job = Job.builder()
                .title(jobDtoRequest.getTitle())
                .description(jobDtoRequest.getDescription())
                .minSalary(jobDtoRequest.getMinSalary())
                .maxSalary(jobDtoRequest.getMaxSalary())
                .location(jobDtoRequest.getLocation())
                .build();

        return job;
    }

}
