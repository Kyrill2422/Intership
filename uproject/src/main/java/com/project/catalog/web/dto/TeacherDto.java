package com.project.catalog.web.dto;

import java.time.LocalDate;
import java.util.List;

public class TeacherDto {

    //Getters And setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public LocalDate getEmploymentDate() { return employmentDate; }
    public void setEmploymentDate(LocalDate employmentDate) { this.employmentDate = employmentDate; }
    public List<SubjectDto> getSubjsects() { return subjsects; }
    public void setSubjsects(List<SubjectDto> subjsects) { this.subjsects = subjsects; }
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    //Fields
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate employmentDate;
    private List<SubjectDto> subjsects;
    private long id;
}
