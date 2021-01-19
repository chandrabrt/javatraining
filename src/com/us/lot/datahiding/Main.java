package com.us.lot.datahiding;

/*
  @author : Chandra Khadka
  @since : 2021-01-19
*/
public class Main {

    public static void main(String[] args) {
        //total amount 400 ---200
        Account account = new Account();
        account.setName("name");
        account.setNumber("0001 0031 0334 0234");
        account.setAmount(200d);

        System.out.println(account.message());
        System.out.println(account.getAmount());
        System.out.println(account.getTotalAmount());

        Double amount = 5000d;
        if (account.getAmount()>=amount){
            account.setAmount(5000d);
        }else {

            System.out.println("Invalid amount!");
            System.out.println("Actual amount:" +account.getTotalAmount());
        }

    }
}
