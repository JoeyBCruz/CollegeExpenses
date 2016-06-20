package com.company;

/**
 * @author: Joseph B. Cruz
 * @date: 6/19/2016
 */

import java.util.Scanner;
import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        createStudent();
    }

    /**
     * The createStudent method handles the input used to create an object of the Student class.
     */
    public static void createStudent(){

        Scanner input = new Scanner(in);
        System.out.println("Please enter the following information");
        System.out.println("Please enter your full name.");
        String name = input.nextLine();
        System.out.println("Please enter the year your are in.");
        String year = input.nextLine();
        System.out.println("Please enter the cost of your supplies (Books, pens, notebooks etc)");
        double costOfSupplies = input.nextDouble();
        System.out.println("Please enter the amount of credit hours you are taking");
        int creditHours = input.nextInt();
        System.out.println("Please enter the cost of each credit hour");
        double costOfCreditHours = input.nextDouble();
        double totalCost = costOfSupplies + (costOfCreditHours * creditHours) + extraCosts();

        Student student = new Student(name, year, costOfSupplies, creditHours, costOfCreditHours, totalCost);

        System.out.println(student.toString());
    }
    
    /**
     * The extraCosts method deals with some one the extra expenses a student has to deal with
     * if they are living at their school.
     * @return the cost of the dorms this semester plus their weekly expenses multiplied by the
     * number of weeks they are staying in the dorm.
     */
    public static double extraCosts(){

        double totalExpense = 0;
        Scanner input = new Scanner(in);
        System.out.println("Are you going to dorm at college? (Yes/No)");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("How long are you going to stay? (In weeks)");
            int weeks = input.nextInt();
            System.out.println("How much is the weekly expense?");
            double expense = input.nextDouble();
            System.out.println("how much are dorming costs this semester?");
            double dormCosts = input.nextDouble();
            totalExpense = dormCosts + ( expense * (double) weeks );
        } else {
            System.out.println("Good to hear you are saving some $$$.");
        }

        return totalExpense;
    }
}
