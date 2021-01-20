package com.us.lot.abs;

/*
  @author : Chandra Khadka
  @since : 2021-01-20
*/
public class Rectangle extends Shape{

    private Double length;
    private Double width;

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public void area() {
      Double area = length*width;
      System.out.println("area of rectangle: "+ area);
    }
}
