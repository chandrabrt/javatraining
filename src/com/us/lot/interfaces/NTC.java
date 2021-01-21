package com.us.lot.interfaces;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public class NTC implements Sim{

    @Override
    public void call(){
        System.out.println("Calling from NTC");
    }

    @Override
    public void sendMessage(){
        System.out.println("Sending message from NTC");
    }
}
