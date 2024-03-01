package org.launchcode.java.exercises.dataTypes;

import java.util.Scanner;

public class MilesPerGallonCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = in.nextDouble();
        System.out.println("How many gallons of gas were used?");
        double gallonsOfGas = in.nextDouble();
        System.out.println("Your car can travel an average of " + miles/gallonsOfGas + " MPG.");
    }
}
