package com.us.lot.interfaces;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public class SmartCell implements Sim{

    @Override
    public void call() {
        System.out.println("Calling from SmartCell");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message from Smartcell");
    }
}
