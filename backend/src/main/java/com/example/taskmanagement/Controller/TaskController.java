package com.example.taskmanagement.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanagement.model.task;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class TaskController {

    @GetMapping("/task")
   public List<task> getAllTasks(){
        return Arrays.asList(
            new task(1L, "Test 1"),
            new task(2L, "test 2"),
            new task(3L,  "test success")
            );
        
   }
    
    
}
