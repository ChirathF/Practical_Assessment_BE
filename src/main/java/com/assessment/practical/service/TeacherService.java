package com.assessment.practical.service;

import com.assessment.practical.controller.TeacherController;
import com.assessment.practical.entity.Teacher;
import com.assessment.practical.repository.TeacherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TeacherService {
    public Logger logger = LoggerFactory.getLogger(TeacherService.class);
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> teacherList(){
        logger.info ("Retrieve all teacher names from DB");
        return teacherRepository.findAll ();
    }

    public Teacher saveTeacher(@RequestBody Teacher teacher){
        logger.info ("Save teacher name in DB");
        return teacherRepository.save (teacher);
    }
}
