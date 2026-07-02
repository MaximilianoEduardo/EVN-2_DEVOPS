package com.duoc.Microservicio_Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/v1/status")
    public String getStatus() {
        return "{\"status\": \"Microservicio DevOps Operacional\"}";
    }
}