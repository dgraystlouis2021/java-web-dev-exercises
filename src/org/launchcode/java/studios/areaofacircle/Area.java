package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double radius,area;

        input = new Scanner(System.in);
        System.out.println("Enter a circle radius: ");
        //if(input.hasNext("[A-Za-z]*")){
        //    System.out.println("You entered a value containing a letter");
        //}
        radius = input.nextDouble();
        while(radius<0.0){
            System.out.println("Enter a circle radius greater than or equal to 0: ");
            radius = input.nextDouble();
        }
        input.close();
        area=Circle.getArea(radius);
        //area=radius*radius*3.14;

        System.out.println("The area of a circle with a radius of "+radius+" is "+area+".");
    }
}
