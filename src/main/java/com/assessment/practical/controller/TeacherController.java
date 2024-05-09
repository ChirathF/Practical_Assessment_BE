package com.assessment.practical.controller;

import com.assessment.practical.entity.Teacher;
import com.assessment.practical.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping ("/list")
    public List<Teacher> teacherList(){
        return teacherService.teacherList ();
    }

    @PostMapping("/save")
    public Teacher addTeacher (@RequestBody Teacher teacher){
        return teacherService.saveTeacher (teacher);
    }
}
