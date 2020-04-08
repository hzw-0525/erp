package com.csdj.controller;

import com.csdj.pojo.Student;
import com.csdj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/indexs")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/getshow")
    public String getshow(Model model){
        List<Student> list=studentService.getAllStudent();
        model.addAttribute("list",list);
        return "index";
    }
}
