/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;
public class EX20 {
    public static void main(String[] args) {
        float height, weight, BMI;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your weight: ");
        weight = in.nextFloat();
        System.out.println("Please enter your height in inches: ");
        height = in.nextFloat();

        BMI = (weight / (height * height) * 703);


        if (BMI < 25 || BMI > 18.5) {
            System.out.println("Your BMI is: " + BMI);
            System.out.println("You are within the ideal weight");
        }
        if (BMI <= 18.4) {
            System.out.println("Your BMI is: " + BMI);
            System.out.println("You are underweight. You should see your doctor");
        }
        if (BMI >= 25.1) {
            System.out.println("Your BMI is: " + BMI);
            System.out.println("You are overweight. You should see your doctor");
        }
        else
            System.out.println("Invalid entry");

    }
}