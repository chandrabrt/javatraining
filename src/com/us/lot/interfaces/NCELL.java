package com.us.lot.interfaces;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public class NCELL implements Sim{

    @Override
    public void call() {
        System.out.println("Calling from NCELL");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message from NCELL");
    }
}
