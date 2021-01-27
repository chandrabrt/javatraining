package com.us.lot.exceptionhandling.customException;

/*
  @author : Chandra Khadka
  @since : 2021-01-27
*/
public class StudentNotFoundException extends RuntimeException{

    private String message;
    private String code;

    public StudentNotFoundException(String message, String code) {
        this.code = code;
        this.message = message;
    }
}
