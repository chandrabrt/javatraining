package com.us.lot.datahiding;

/*
  @author : Chandra Khadka
  @since : 2021-01-19
*/
//database....save...amount
public class Account {
    //data hiding---security
    private Double totalAmount;
    private String name;
    private String number;
    private Double amount = 200d;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String message(){
        return "success";
    }

    public Double getTotalAmount() {
        return amount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
