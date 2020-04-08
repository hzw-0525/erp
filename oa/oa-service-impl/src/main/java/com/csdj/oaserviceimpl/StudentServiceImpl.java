package com.csdj.oaserviceimpl;

import com.csdj.oadao.StudentMapper;
import com.csdj.pojo.Student;
import com.csdj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectAll();
    }
}
