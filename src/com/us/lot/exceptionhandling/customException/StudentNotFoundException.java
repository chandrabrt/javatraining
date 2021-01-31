package com.us.lot.exceptionhandling.customException;

/*
  @author : Chandra Khadka
  @since : 2021-01-27
*/
public class StudentNotFoundException extends Exception{

    public StudentNotFoundException(String s) {
        super(s);
    }
//    private String message;
//    private String code;
//
//    public StudentNotFoundException(String code, String message) {
//        this.code = code;
//        this.message = message;
//    }
}
