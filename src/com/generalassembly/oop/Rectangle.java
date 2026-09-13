package com.generalassembly.oop;

public class Rectangle extends Shape{
    private double length;
    private double height;

    public Rectangle(double length, double height){
    this.height= height;
    this.length=length;
    }

    @Override
    public double getCircumference(){
        return 2*(length+height);
    }
    @Override
    public double getArea(){
return length*height;
    }
}
