package com.us.lot.exceptionhandling;

import com.us.lot.exceptionhandling.customException.StudentNotFoundException;
import com.us.lot.exceptionhandling.entity.Student;
import com.us.lot.exceptionhandling.service.SchoolService;
import com.us.lot.exceptionhandling.service.SchoolServiceImpl;
import com.us.lot.exceptionhandling.service.StudentService;
import com.us.lot.exceptionhandling.service.StudentServiceImpl;

/*
  @author : Chandra Khadka
  @since : 2021-01-27
*/
public class MainMethod {

    public static void main(String[] args) {
        SchoolService schoolService = new SchoolServiceImpl();
        Student student = null;
        try {
            student = schoolService.findStudentDetailByName("Shyan");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(student.getName());
    }
}
