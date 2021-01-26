package com.us.lot;

import com.us.lot.constant.MyConstant;

/*
  @author : Chandra Khadka
  @since : 2021-01-26
*/
public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("chandra khadka");
        student.setAddress("Biratnagar");
        student.setGender(Gender.MALE);
        System.out.println(MyConstant.PI);//best approach---class load, static
    }
}
