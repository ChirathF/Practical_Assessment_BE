package com.assessment.practical.controller;

import com.assessment.practical.entity.Teacher;
import com.assessment.practical.service.TeacherService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    public Logger logger = LoggerFactory.getLogger(TeacherController.class);
    @Autowired
    private TeacherService teacherService;

    @GetMapping ("/list")
    public List<Teacher> teacherList(){
        logger.info("View teacher list API request received");
        return teacherService.teacherList ();
    }

    @PostMapping("/save")
    public Teacher addTeacher (@RequestBody Teacher teacher){
        logger.info("Save teacher API request received");
        return teacherService.saveTeacher (teacher);
    }
}
