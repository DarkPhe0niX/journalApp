package net.nishinoya.journalApp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HealthCheck {
    @GetMapping("healthcheck")    
    public String healthcheck(){
        return "Ok";
}
}
