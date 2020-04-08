package com.csdj.service;

import com.csdj.pojo.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有学生
     * @return
     */
    public List<Student> getAllStudent();
}
