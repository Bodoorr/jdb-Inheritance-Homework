package com.generalassembly.oop;

public class Square extends Rectangle {
    public Square(double side){
        //super to get the parent class (Rectangle) constructor
        super(side,side);
    }
}
