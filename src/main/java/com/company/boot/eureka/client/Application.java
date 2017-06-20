/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.boot.eureka.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {
    
    private final static Logger log =LoggerFactory.getLogger(Application.class);
    
    private String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
    
    @RequestMapping("/greeting")
    public String greeting() {
        log.info("getGreeting()");
        return "Hello from EurekaClient!";
    }
    
    @RequestMapping("/toppings")
    public String[] getToppings() {
        log.info("getToppings()");
        return toppings;
    }
    
     public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
