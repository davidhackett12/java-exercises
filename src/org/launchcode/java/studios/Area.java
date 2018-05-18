package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static double findArea(double radius) {
        double area = radius * radius * 3.14;
        return area;
    }
    public static boolean validateInput(double radius) {
        if (radius < 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        boolean validated = false;
        while(validated == false) {
            System.out.println("What is the radius?");
            double radius = in.nextDouble();
            if (validateInput(radius) == false) {
                System.out.println("This is not a valid radius");
            } else {
                double result = findArea(radius);
                System.out.println("The area of the circle is " + result);
                validated = true;
            }
        }

    }
}

