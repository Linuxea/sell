package com.linuxea.sell.repository;

import com.linuxea.sell.model.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void save(){
        Teacher teacher = new Teacher();
        teacher.setId(196);
        teacher.setName("reporitory");
        Teacher teacherSave = teacherRepository.save(teacher);
        assertNotNull(teacherSave);
    }

    @Test
    public void findOne(){
        Teacher one = teacherRepository.findOne(196);
        System.out.println(one);
    }

    @Test
    public void deleteOne(){
        teacherRepository.delete(196);
    }

}