package com.us.lot.exceptionhandling;

import java.util.Scanner;

/*
  @author : Chandra Khadka
  @since : 2021-01-27
*/
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        try {
            double result = div(num1, num2);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("logic");
            throw new ArithmeticException("Divided by zero");
        }finally {
            System.out.println("chandra khadka");
            System.out.println("chandra khadka");
            System.out.println("chandra khadka");
            System.out.println("chandra khadka");
            System.out.println("chandra khadka");
            System.out.println("chandra khadka");
        }

        ;
        ;
        ;
        //most important]]

    }

    public static double div(int num1, int num2){
        return num1/num2;
    }
}
