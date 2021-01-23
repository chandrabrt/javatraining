package com.us.lot.interface_example.service;

import com.us.lot.interface_example.entity.Student;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public interface StudentService {
    //what to do?
    void save(Student student);

    Student getStudentDetailByStudentName(String name);

    void deleteStudentByName(String name);

    Integer getStudentRollNumberByName(String name);

}
