package com.us.lot.interface_example.service;

import com.us.lot.interface_example.entity.Student;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public interface StudentService {
    //real database...assumption
    void save(Student student);

    Student getStudentDetailByStudentName();

    void deleteStudentByName(String name);
}
