package com.us.lot.looping;

import java.util.Arrays;
import java.util.List;

/*
  @author : Chandra Khadka
  @since : 2021-01-17
*/
public class ForLoop {
    public static void main(String[] args) {
        /*
        for(initialization ; condition; inc/dec){
            //bussiness logic

        } //minimum us

        //extended for loop

        for(data_type variableName: List/Array_name){

        }
         */

        List<Student> students = Arrays.asList(
                new Student("chandra khadka", "BRT", 26, Gender.M),
                new Student("Ram", "BRT", 20, Gender.M),
                new Student("Shyam", "KTM", 22, Gender.M),
                new Student("Hari", "BRT", 21, Gender.M),
                new Student("Gita", "DMK", 25, Gender.F)
        );

//                      or
//        Student[] students = new Student[3];
//        Student student1 = new Student("chandra khadka", "BRT", 26);
//        Student student2 = new Student("Ram", "BRT", 20);
//        Student student3 = new Student();
//
//        student3.setName("Shyam");
//        student3.setAddress("KTM");
//        student3.setAge(22);
//        students[0] = student1;
//        students[1] = student2;
//        students[2] = student3;

        System.out.println(students.size());

//        for (int i =0 ; i<students.size(); i++){
////            System.out.println(students.get(i).toString());
//            System.out.println("Name: " + students.get(i).getName());
//            System.out.println("Address: "+students.get(i).getAddress());
//            System.out.println("Age: "+students.get(i).getAge());
//            System.out.println("-----------------------");
//        }
//                      or
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Age: " + student.getAge());
            System.out.println("Gender: "+ student.getGender().getValue());

            if (student.getName().equals("Ram")){
                //logic condition.....document
                student.setStatus(Status.ACTIVE);
            }
            System.out.println("Status: "+ student.getStatus());
            System.out.println("-----------------------");
        }
    }
}
