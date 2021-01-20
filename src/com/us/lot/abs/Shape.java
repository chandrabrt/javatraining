package com.us.lot.abs;

/*
  @author : Chandra Khadka
  @since : 2021-01-20
*/
public abstract class Shape {

    private Double radius;

    private String color;

    public abstract void area();

    public String getColor() {
        //body of method
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
