package com.us.lot.javaday1;

/*
  @author : welcome-to-hell
  @since : 2021-01-12
*/
public class Math {
    int num1 = 2;
    int num2  = 2;

    void display(){
        sum(num1, num2);
        sub(num1, num2);
        div(num1, num2);
        mul(num1, num2);
    }

    static int sum(int num1, int num2){
        return num1 + num2;
    }

    static void sub(int num1, int num2){
        int sub = num2-num1;
        System.out.println("sub: "+ sub);

    }

    static void div(int num1, int num2){
        int div = num2/num1;
        System.out.println("div: "+ div);
    }

    static void mul(int num1, int num2){
        int mul = num2*num1;
        System.out.println("sum: "+ mul);
    }
}
