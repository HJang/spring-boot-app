package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @Value("${DOMAIN_NAME}")
    private String domainName;

    private Map<String, String> services = new HashMap<>();

    @GetMapping
    public ResponseEntity<String> getService() {
        return ResponseEntity.ok("Hello, Raymond. I am service agent");
    }

    @PostMapping
    public ResponseEntity<String> registerService(@RequestBody Map<String, String> serviceData) {
        String serviceName = serviceData.get("service_name");
        String serviceDescription = serviceData.get("service_description");
        services.put(serviceName, serviceDescription);
        return ResponseEntity.ok(serviceName + " is registered");
    }
}