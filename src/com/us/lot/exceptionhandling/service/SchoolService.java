package com.us.lot.exceptionhandling.service;

import com.us.lot.exceptionhandling.customException.StudentNotFoundException;
import com.us.lot.exceptionhandling.entity.Student;

/*
  @author : Chandra Khadka
  @since : 2021-01-31
*/
public interface SchoolService {

    Student findStudentDetailByName(String name) throws StudentNotFoundException;

}
