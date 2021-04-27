package com.project.catalog.web.dto;

public class SubjectDto {
    //Getters And Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getCreditPuncte() { return creditPuncte; }
    public void setCreditPuncte(Integer creditPuncte) { this.creditPuncte = creditPuncte; }
    public boolean isOptional() { return isOptional; }
    public void setOptional(boolean optional) { isOptional = optional; }
    public SubjectScoringDto getSubject() { return subject; }
    public void setSubject(SubjectScoringDto subject) { this.subject = subject; }
    public long getId() { return id; }

    //Fields;
    private String name;
    private Integer creditPuncte;
    private boolean isOptional;
    private SubjectScoringDto subject;



    public void setId(long id) {
        this.id = id;
    }

    private long id;




}
