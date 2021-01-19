package com.us.lot.inheritance;

/*
  @author : Chandra Khadka
  @since : 2021-01-19
*/
public class Main {
    public static void main(String[] args) {

//        Student student1 = new Student();
//        String studentAddress = student1.address();
//        System.out.println("student1 address::" + studentAddress);
//
//        Student student2 = new Student();
//        String student2Address = student2.addressDetails();
//        System.out.println("student2 address::" + student2Address);
//
//        Teacher teacher = new Teacher();
//        String teacherAdd = teacher.addressDetails();
//        System.out.println("teacher address:: " + teacherAdd);

        Person student = new Student();
        System.out.println(student.addressDetails());
        student.message();
    }
}
