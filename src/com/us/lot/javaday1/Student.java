package com.us.lot.javaday1;

/*
  @author : welcome-to-hell
  @since : 2021-01-12
*/
public class Student {

    void information(){
        System.out.println("Name: "+ "Ram Gautam");
        System.out.println("Address: "+ "Damak");
        System.out.println("Age: "+ 21);
        System.out.println("Faculty: "+ "BSc CSIT" );

        System.out.println("Name: "+ "Ram Gautam");
        System.out.println("Address: "+ "Damak");
        System.out.println("Age: "+ 21);
        System.out.println("Faculty: "+ "BSc CSIT" );

        System.out.println("Name: "+ "Ram Gautam");
        System.out.println("Address: "+ "Damak");
        System.out.println("Age: "+ 21);
        System.out.println("Faculty: "+ "BSc CSIT" );

    }

    static void faculty(){
        System.out.println("BSc CSIT");
    }

    void teacherInfo(){
        Teacher teacher = new Teacher();
        teacher.teacherInfo();
    }
}
