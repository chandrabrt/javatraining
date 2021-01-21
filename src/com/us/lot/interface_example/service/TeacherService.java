package com.us.lot.interface_example.service;

import com.us.lot.interface_example.entity.Teacher;

import java.util.List;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public interface TeacherService {
   //what to do?
    void save();

    Teacher getTeacherDetailByName();

    void deleteTeacherByName(String name);

    void updateRecord(String name);

    List<Teacher> getAllTeacher();

}
