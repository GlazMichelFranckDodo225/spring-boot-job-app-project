package com.dgmf.controller;

import com.dgmf.dto.JobDtoResponse;
import com.dgmf.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/jobs")
@RequiredArgsConstructor
public class JobController {
    private final JobService jobService;

    // Get All Jobs REST API
    @GetMapping
    public ResponseEntity<List<JobDtoResponse>> getAllJobs() {
        return ResponseEntity.ok(jobService.getAllJobs());
    }
}
