package com.company;

public class Rectangle  extends Shape{

    private double width;
    private double length;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        setWidth(width);
        setLength(length);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Width : " + getWidth());
        System.out.println("Length : " + getLength());
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public double getPerimeter() {
        return 2*(getWidth()+getLength());
    }
}
