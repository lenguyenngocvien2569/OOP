package com.company;

import java.lang.Math;
public class Circle extends Shape {
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        setRadius(radius);
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        setRadius(radius);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Radius : " + getRadius());
    }

    @Override
    public double getArea() {
        return Math.pow(getRadius(),2)*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*getRadius();
    }
}
