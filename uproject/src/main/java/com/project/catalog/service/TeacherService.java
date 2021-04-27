package com.project.catalog.service;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    public TeacherDto getTeacher(){
        TeacherDto dto = new TeacherDto();
        dto.setFirstName("Ion");
        dto.setLastName("Popescu");
        dto.setBirthDate(LocalDate.now());
        dto.setEmploymentDate(LocalDate.now());
        dto.setSubjsects();
    }

    private List<SubjectDto> getSubjects(){
        SubjectDto subjectDto = new SubjectDto();
        subjectDto.setId(1L);
        subjectDto.setCreditPuncte(2);
        subjectDto.setOptional(false);
        subjectDto.setName("Progama orientata boiect");

    }

}
