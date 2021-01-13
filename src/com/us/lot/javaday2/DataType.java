package com.us.lot.javaday2;

/*
  @author : welcome-to-hell
  @since : 2021-01-13
*/
public class DataType {

    public static void main(String[] args){
        // primitive data types
        /*
         *  1. Integer type: byte(-128, 127), short(-32768,32767), int(-2^31 to 2^31-1) , long  e.g. 1, 23,67
         *  2. Floating type: float, double  e.g 1.2, 36.0
         *  3. Boolean type:  boolean e.g. true, false
         *  4. Character type : char  ---single characters e.g "a",  ASCI- 65, 97
         */
        typeCasting(23);
    }

    public static void typeCasting(int num1){
        long l = num1;
        double d = num1;
        float f = num1;
        short s = (short) num1;
        byte b = (byte) num1;
        System.out.println("long: "+ l);
        System.out.println("double: "+ d);
        System.out.println("float: "+ f);
        System.out.println("short: "+ s);
        System.out.println("byte: "+ s);
    }
}
