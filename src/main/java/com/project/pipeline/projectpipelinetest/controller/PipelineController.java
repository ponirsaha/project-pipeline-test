package com.project.pipeline.projectpipelinetest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipelineController {
    @GetMapping("/response")
    public String showTestResponse(){
        return "Hello from Pipeline Test.";
    }
}
