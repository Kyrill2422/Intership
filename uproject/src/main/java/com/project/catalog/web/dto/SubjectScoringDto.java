package com.project.catalog.web.dto;

public class SubjectScoringDto {

    //Constructors
    public SubjectScoringDto(Integer coursePercent, Integer seminaryPrecent) {
        this.coursePercent = coursePercent;
        this.seminaryPrecent = seminaryPrecent; }

    public SubjectScoringDto() {}

    //Getters + Setters
    public Integer getCoursePercent() { return coursePercent; }
    public void setCoursePercent(Integer coursePercent) { this.coursePercent = coursePercent; }
    public Integer getSeminaryPrecent() { return seminaryPrecent; }
    public void setSeminaryPrecent(Integer seminaryPrecent) { this.seminaryPrecent = seminaryPrecent; }

    //Fields;
    private Integer coursePercent;
    private Integer seminaryPrecent;

}
