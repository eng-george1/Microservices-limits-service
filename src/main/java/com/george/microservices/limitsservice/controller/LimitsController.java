package com.george.microservices.limitsservice.controller;

import com.george.microservices.limitsservice.entity.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitsController {
    @GetMapping
    public Limits retrieveLimits(){
return new Limits(1,1000);
    }
}
