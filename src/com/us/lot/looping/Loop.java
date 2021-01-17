package com.us.lot.looping;

/*
  @author : Chandra Khadka
  @since : 2021-01-17
*/
public class Loop {
    public static void main(String[] args) {
        String[] arr = new String[]{"ram", "shyam", "hari"};

        System.out.println("Using simple indexing---never use");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-------------------------");

        System.out.println("Using for loop...");
        for (int i = 0 ; i< arr.length; i++){
            //bussiness logic
            System.out.println(arr[i]);
        } //minimum use

        System.out.println("-----------------------------");

        System.out.println("Using extended for loop");
//        extendent for loop
        for(String a : arr){
            System.out.println(a);
        }
    }
}
