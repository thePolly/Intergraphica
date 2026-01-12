package com.intergraphica.backend.projects;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @GetMapping("/{id}")
    public ProjectDto getProject(@PathVariable String id) {
        return new ProjectDto(id, "title", Instant.now(), "{}");
    }
}
