package com.us.lot.interface_example;

import com.us.lot.interface_example.entity.Student;
import com.us.lot.interface_example.service.StudentService;
import com.us.lot.interface_example.service.impl.StudentServiceImpl;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public class Main {

    public static void main(String[] args) {
        //dynamically configure
        StudentService studentService = new StudentServiceImpl();
        saveStudentDetails(studentService);
    }

    private static void saveStudentDetails(StudentService studentService) {
        Student student = new Student();
        student.setName("ram");
        student.setAge(21);
        student.setGender("MALE");
        studentService.save(student);

        Student studentDetailByStudentName = studentService.getStudentDetailByStudentName("shyam");
        System.out.println(studentDetailByStudentName.toString());
    }

}
