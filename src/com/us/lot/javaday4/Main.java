package com.us.lot.javaday4;

import java.util.Scanner;

/*
  @author : welcome-to-hell
  @since : 2021-01-15
*/
public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //console read
//        System.out.println("Enter your firstName:: ");
//        String firstName = scanner.nextLine();
//
//        System.out.println("Enter your middleName:: ");
//        String middleName = scanner.nextLine();
//
//        System.out.println("Enter your lastName:: ");
//        String lastName = scanner.nextLine();
//9
//        Teacher teacher1 = new Teacher(firstName, middleName, lastName);
//        System.out.println(teacher1.toString());

        //html form
        Student student = new Student();
        //setter
        student.setFirstName("ABC");
        student.setMiddleName("DEF");
        student.setLastName("GHI");
        student.setAge(21);
        student.setContactNumber("9824376278");

        //getter
        System.out.println(student.getFirstName());
        System.out.println(student.getMiddleName());
        System.out.println(student.getContactNumber());
        //1000
        System.out.println("fullName: " + student.getFullName());

    }
}
