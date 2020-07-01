package com.company;

abstract public class Shape {
    private String color;
    private Boolean filled;

    public Shape(){

    }
    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();


    public void outPut() {
        System.out.println("Color : " + getColor());
        System.out.println("Filled : " + getFilled());
    }

}
