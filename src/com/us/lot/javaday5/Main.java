package com.us.lot.javaday5;

import java.util.Scanner;

/*
  @author : welcome-to-hell
  @since : 2021-01-16
*/
public class Main {

    public static void main(String[] args) {

        boolean value = true;
        int a = 10;
        int b = 11;

        if(a>=b || a==10){}

        //condition- true or false(boolean)

//        if(condition){
//            //business logic
//            System.out.println("hello");
//        }else{
//            //business logic
//            System.out.println("hi");
//        }

        //user through- web application --form, input , console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day!");
        String day = scanner.nextLine();

        if(day.equals("sunday")){
            //hundreds of code
            System.out.println("Today is sunday!");
        }
        else if(day.equals("monday")){
            System.out.println("Today is Monday!");
        }
        else{
            System.out.println("Invalid day!");
        }
    }
}
