package com.us.lot.javaday3;

/*
  @author : welcome-to-hell
  @since : 2021-01-14
*/
public class Array {

    public static void main(String[] args) {
        //declaration
        /*
          data_type array_name[][]......;
        */

        //initialization
        /*
         *  array_name = new data_type[array_size]
         */
        //step 1:  0,1,2,------9
        int[] arr;
        arr = new int[10];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        ;
        ;
        ;
        ;
        arr[9] = 10;
        System.out.println(arr[4]);

        int[] arr2 = {1, 2, 3, 4, 5};  //1*1

        //step2:
//        int arr1[] = new int[10];

        //multi-dimensional
        int multi[][] = new int[2][4];
        multi[0][0] = 5;
        multi[0][1] = 2;

        multi[1][0] = 3;
        multi[1][1] = 4;
        System.out.println(multi[0][1]);

        int[][] arr3 = {{2, 3, 3, 4}, {2, 3, 4, 4}};    //2*4


        //anonymous -- no array name -- use once, parameter(args)

        int[] a;
        a = new int[2];
        a[0] = 1;
        a[1] = 2;

        arrays(new int[]{1, 2});

    }

    public static String arrays(int[] arr) {
        //business logic

        return "complete";
    }
}
