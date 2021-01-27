package com.us.lot.exceptionhandling.service;

import com.us.lot.exceptionhandling.entity.Student;

/*
  @author : Chandra Khadka
  @since : 2021-01-27
*/
public interface StudentService {

    Student findByName(String name);
}
