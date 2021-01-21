package com.us.lot.interfaces;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public class Main {

    public static void main(String[] args) {
        System.out.println("ntc number");
        Sim ntc = new NTC();
        ntc.call();
        ntc.sendMessage();

        System.out.println("---------------------");
        System.out.println("ntc new number");
        NTC ntc1 = new NTC();
        ntc.call();
        ntc.sendMessage();

    }
}
