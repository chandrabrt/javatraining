package com.us.lot.exceptionhandling;

import com.us.lot.exceptionhandling.entity.Student;
import com.us.lot.exceptionhandling.service.StudentService;
import com.us.lot.exceptionhandling.service.StudentServiceImpl;

/*
  @author : Chandra Khadka
  @since : 2021-01-27
*/
public class MainMethod {
    public static void main(String[] args) {
        StudentService studentService  = new StudentServiceImpl();

        Student student = studentService.findByName("Sapkota");
        System.out.println(student.getName());
    }
}
