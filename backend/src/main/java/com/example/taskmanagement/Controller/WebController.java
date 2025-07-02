package com.example.taskmanagement.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Task Management Automation API";
    }

}
