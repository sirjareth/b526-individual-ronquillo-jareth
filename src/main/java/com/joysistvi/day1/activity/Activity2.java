package com.joysistvi.day1.activity;

public class Activity2{

    public static double getRemainingBalance(double income, double food, double transport, double rent, double utility) {
        double totalExpenses = food + transport + rent + utility;
        return income - totalExpenses;
    }

    public static double getExpensePercentage(double expense, double income) {
        return (expense / income) * 100;
    }
}
