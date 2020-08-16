package com.farid.spring.cloud.eureka.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("main")
public class MainController {
    @GetMapping(value = "/")
    public String eurekaClient1(){
        return "Hello.This is a eureka client!";
    }
}
