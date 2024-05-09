package com.assessment.practical.service;

import com.assessment.practical.entity.Teacher;
import com.assessment.practical.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> teacherList(){
        return teacherRepository.findAll ();
    }

    public Teacher saveTeacher(@RequestBody Teacher teacher){
        return teacherRepository.save (teacher);
    }
}
