package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int c =0;
        ArrayList <Shape> circles = new ArrayList<Shape>();
        while (c != 13){
            Scanner cin = new Scanner(System.in);
            System.out.println("1 : Add Circle ");
            System.out.println("2 : Add Rectangle ");
            System.out.println("0 : Get All ");
            System.out.print("Input chose : ");
            c = cin.nextInt();
            switch (c){
                case 1:
                    System.out.print(" Input radius : ");
                    double radius = cin.nextDouble();
                    System.out.print(" Input color : ");
                    String color = cin.next();
                    System.out.print(" Input filled : ");
                    boolean filled = cin.nextBoolean();
                    Circle a = new Circle(radius,color,filled);
                    circles.add(a);
                    break;
                case 2 :
                    System.out.print(" Input width : ");
                    double width = cin.nextDouble();
                    System.out.print(" Input length : ");
                    double length = cin.nextDouble();
                    System.out.print(" Input color : ");
                    String colorRec = cin.next();
                    System.out.print(" Input filled : ");
                    boolean filledRec = cin.nextBoolean();
                    Rectangle newRec = new Rectangle(width,length,colorRec,filledRec);
                    circles.add(newRec);
                    break;
                case 0:
                    for (int i = 0; i < circles.size() ; i++) {
                        System.out.println( "----"+ (i+1) +"----");
                        circles.get(i).outPut();
                        System.out.println("Area : " + circles.get(i).getArea());
                        System.out.println("Perimeter : " + circles.get(i).getPerimeter());
                    }
//                    for (Shape cs: circles){
//                        cs.outPut();
//                    }
                    break;
                default:
                    break;
            }
        }


    }
}
