package com.us.lot.javaday3.methods;

import com.us.lot.javaday2.Student;
import com.us.lot.javaday3.constructors.Employee;

/*
  @author : welcome-to-hell
  @since : 2021-01-14
*/
public class Department {

    void departmentInfo() {
        //business logic
        System.out.println("no returns");
    }

    void departmentInfoWithName(String name) {

    }

    String departmentInfoWithReturnType(String name) {
        //logic
        return "";
    }

    Student studentInfo() {
        return new Student("name", 200);
    }

    Student studInfo(String name) {
        if (name.equals("hari")) {
            return studentInfo();
        }
        return new Student("ram", 300);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("name", "address", "98234376278"); //set data
        Employee employee_ram = new Employee("Ram", "Brt", "9823437679"); //set data
        Employee employee_shyam = new Employee("Shyam", "Brt", "9823477679"); //set data
//        employee.message();
        System.out.println(employee_shyam.toString()); //get data
    }
}
