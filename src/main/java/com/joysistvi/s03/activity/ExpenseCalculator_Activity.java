package com.joysistvi.s03.activity;

public class ExpenseCalculator_Activity {
    public static void main(String[] args) {
        // Monthly Income
        double monthlyIncome = 50000.00;

        // Monthly Expenses
        double foodAllowance = 15000.00;
        double transportation = 2500.00;
        double rent = 4500.00;
        double utilityBill = 3500.00;

        // Calculations
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = monthlyIncome - totalExpenses;

        // Percentage Calculations
        double foodPercent = (foodAllowance / monthlyIncome) * 100;
        double transportPercent = (transportation / monthlyIncome) * 100;
        double rentPercent = (rent / monthlyIncome) * 100;
        double utilityPercent = (utilityBill / monthlyIncome) * 100;
        double totalExpensePercent = (totalExpenses / monthlyIncome) * 100;
        double remainingPercent = (remainingBalance / monthlyIncome) * 100;

        // Output Breakdown
        System.out.println("==========================================");
        System.out.println("        MONTHLY EXPENSE BREAKDOWN         ");
        System.out.println("==========================================");
        System.out.printf("Monthly Income      : PHP %.2f%n", monthlyIncome);
        System.out.println("------------------------------------------");
        System.out.printf("Food Allowance      : PHP %.2f (%.1f%%)%n", foodAllowance, foodPercent);
        System.out.printf("Transportation      : PHP %.2f (%.1f%%)%n", transportation, transportPercent);
        System.out.printf("Rent                : PHP %.2f (%.1f%%)%n", rent, rentPercent);
        System.out.printf("Utility Bill        : PHP %.2f (%.1f%%)%n", utilityBill, utilityPercent);
        System.out.println("------------------------------------------");
        System.out.printf("Total Expenses      : PHP %.2f (%.1f%%)%n", totalExpenses, totalExpensePercent);
        System.out.printf("Remaining Balance   : PHP %.2f (%.1f%%)%n", remainingBalance, remainingPercent);
        System.out.println("==========================================");
    }
}