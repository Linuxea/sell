package com.linuxea.sell.service;

import com.linuxea.sell.model.Teacher;

/**
 * create by linuxea 11/1/17
 */
public interface ITeacherService {


    Teacher findOne(Integer id);

    Teacher save(Teacher teacher);

}
