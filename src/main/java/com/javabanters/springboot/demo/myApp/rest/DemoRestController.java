package com.javabanters.springboot.demo.myApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @Value("${coach.name}")
    String coachName;

    @Value("${team.name}")
    String teamName;
    //expose an endpoint
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }


    @GetMapping("/teaminfo")
    public String getTeamInfo() {

        return coachName + " " + teamName;
    }

}
