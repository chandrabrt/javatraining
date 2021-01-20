package com.us.lot.abs;

/*
  @author : Chandra Khadka
  @since : 2021-01-20
*/
public class Circle extends Shape {

    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void area(){
        Double area = Math.PI * radius * radius;
        System.out.println("area of circle is: "+ area);
    }
}

