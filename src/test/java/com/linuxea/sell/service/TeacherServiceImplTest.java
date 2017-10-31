package com.linuxea.sell.service;

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
public class TeacherServiceImplTest {

    @Autowired
    private ITeacherService iTeacherService;

    @Test
    public void test(){
        Teacher teacher = iTeacherService.findOne(1);
        assertNotNull(teacher);
    }

    @Test
    public void saveTest(){
        Teacher teacher = new Teacher();
        teacher.setId(12344);
        teacher.setName("liu mang");
        Teacher teacher1 = iTeacherService.save(teacher);
        assertNotNull(teacher1);
    }


}