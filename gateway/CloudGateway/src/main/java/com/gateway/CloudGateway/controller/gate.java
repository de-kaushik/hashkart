package com.gateway.CloudGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gate {


    @GetMapping(value = "/gete")
    public String gatee(){
        return"gate";
    }
}
