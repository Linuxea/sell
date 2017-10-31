package com.linuxea.sell.service;

import com.linuxea.sell.model.Teacher;
import com.linuxea.sell.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by linuxea 11/1/17
 */

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher findOne(Integer id) {
        return teacherRepository.findOne(id);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
