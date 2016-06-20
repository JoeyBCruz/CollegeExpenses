package com.company;

/**
 * The Student class is responsible for the basic information of a student
 */

public class Student {

    private String name;
    private String year;
    private double costOfSupplies;
    private int creditHours;
    private double creditHoursCost;
    private double totalCosts;

    public Student() {}

    public Student(String name, String year, double costOfSupplies, int creditHours, double creditHoursCost, double totalCosts) {
        this.name = name;
        this.year = year;
        this.costOfSupplies = costOfSupplies;
        this.creditHours = creditHours;
        this.creditHoursCost = creditHoursCost;
        this.totalCosts = totalCosts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getCostOfSupplies() {
        return costOfSupplies;
    }

    public void setCostOfSupplies(double costOfSupplies) {
        this.costOfSupplies = costOfSupplies;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public double getCreditHoursCost() {
        return creditHoursCost;
    }

    public void setCreditHoursCost(double creditHoursCost) {
        this.creditHoursCost = creditHoursCost;
    }

    public double getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(double totalCosts) {
        this.totalCosts = totalCosts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", costOfSupplies=" + costOfSupplies +
                ", creditHours=" + creditHours +
                ", creditHoursCost=" + creditHoursCost +
                ", totalCosts=" + totalCosts +
                "}";
    }
}
