package com.example.taskmanagement.model;

public class task {
    private Long id;
    private String title;
    
    public task(Long id, String title){
        this.id = id;
        this.title = title;
    }
    public Long getId(){
        return id;
    }
    public void setID(Long id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

}
