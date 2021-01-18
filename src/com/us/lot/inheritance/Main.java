package com.us.lot.inheritance;

/*
  @author : Chandra Khadka
  @since : 2021-01-18
*/
public class Main {

    public static void main(String[] args) {

//        Person person = new Person();
//        person.setName("Student");
//        person.setAge(21);
//        person.setGender("MALE");
//
//        Person person1 = new Person("Teacher", 23, "FEMALE");
//        ------------------

//        Student student = new Student();
//        student.setAge(21);
//        student.setName("Student");
//        student.setGender("MALE");
//        student.setRollNo(23);
//
//        Student student1 = new Student(23,"name", 21, "MALE");

        //setter
        Teacher teacher = new Teacher();
        teacher.setAge(21);
        teacher.setName("Teacher");
        teacher.setGender("MALE");
        teacher.setEmpId("EM-21");

        //getter
        System.out.println(teacher.getEmpId());

        //constructor
        Teacher teacher1 = new Teacher("EM-21", "Teacher", 21, "FEMALE");



    }

}
