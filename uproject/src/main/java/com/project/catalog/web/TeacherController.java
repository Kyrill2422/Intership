package com.project.catalog.web;

import com.project.catalog.service.TeacherService;
import com.project.catalog.web.dto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService)
    {
        this.teacherService = teacherService;
    }

    @GetMapping(value = "/hello")
    public String hello() {  return "hello";  }

    @GetMapping(value = "/ ")
    public TeacherDto getTeacher()
    {
        return null;
    }





}
