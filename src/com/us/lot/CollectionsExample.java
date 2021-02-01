package com.us.lot;

import java.util.*;

/*
  @author : Chandra Khadka
  @since : 2021-02-01
*/
public class CollectionsExample {

    public static void main(String[] args) {
        //nihareeka...1first sem....admit..
        //form html...student

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("ram", "brt");
        Student student2 = new Student("rimesh", "brt");

        students.add(student1);
        students.add(student2);

        System.out.println("Before: " + students.size());
        System.out.println("After: " + students.size());
    }
}
