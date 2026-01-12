package com.intergraphica.backend.projects;

import java.time.Instant;

public record ProjectDto (
        String id,
        String title,
        Instant lastUpdate,
        String data
){


}
