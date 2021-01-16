package com.us.lot.javaday5;

import java.util.Scanner;

/*
  @author : welcome-to-hell
  @since : 2021-01-16
*/
public class Switch {

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day!");
        String day = scanner.nextLine();

         * if(day.equals("sunday")){
            System.out.println("Today is sunday!");
        }
        else if(day.equals("monday")){
            System.out.println("Today is Monday!");
        }
        else{
            System.out.println("Invalid day!");
        }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day!");
        String day = scanner.nextLine();

        switch (day){
            case "sunday":
                System.out.println("Today is sunday");
                break;
            case "monday":
                System.out.println("Today is Monday!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }

}
