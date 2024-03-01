package org.launchcode.java.exercises.dataTypes;

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        double height = in.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double width = in.nextDouble();
        System.out.println("The rectangles area is " + height *width);
    }

}
