package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
            while (radius <= 0) {
                System.out.println("Enter a positive number for radius: ");
                radius = input.nextDouble();
            }
            System.out.println(Circle.getArea(radius));
        } else {
            System.out.println("Invalid input");
        }
    }
}
