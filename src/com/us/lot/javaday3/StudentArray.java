package com.us.lot.javaday3;

import com.us.lot.javaday1.Teacher;
import com.us.lot.javaday2.Student;

/*
  @author : welcome-to-hell
  @since : 2021-01-14
*/
public class StudentArray {
    //everything object expect primitive datatype

    public static void main(String[] args) {

        Student student2 = new Student("Hari", 20000);
        Teacher teacher = new Teacher("Hareram");

        Student[] students = new Student[2];

        students[0] = new Student("Ram", 20000);
        students[1] = student2;

        Teacher[] teachers = new Teacher[2];
        teachers[0] = teacher;

        Math[] maths = new Math[2];


//        for (int i = 0 ; i<2 ; i++){
//            System.out.println(students[i].display());
//        }

//        for (Student student: students){
//            System.out.println(student.display());
//        }

        System.out.println(students[0].display());
        System.out.println(students[1].display());
    }
}
