package com.joysistvi.day1.activity;

public class DataType_Activity {
    public static void main(String[] args) {
        // Declare and initialize variables for all required data types
        boolean isEnrolled = true;             // boolean data type
        byte studentAge = 20;                  // byte data type
        short yearLevel = 2;                   // short data type
        int enrollmentCount = 1500;            // int data type
        long worldPopulation = 8000000000L;    // long data type (requires 'L' suffix)
        float bodyTemperature = 36.6f;         // float data type (requires 'f' suffix)
        double exactPi = 3.14159265359;        // double data type
        char section = 'A';                    // char data type (single quotes)
        String studentName = "Juan Dela Cruz"; // String data type (double quotes)

        // Display each variable with a label identifying its data type
        System.out.println("==========================================");
        System.out.println("      JAVA VARIABLES AND DATA TYPES       ");
        System.out.println("==========================================");
        System.out.println("Student Name (String)     : " + studentName);
        System.out.println("Section (char)            : " + section);
        System.out.println("Student Age (byte)        : " + studentAge);
        System.out.println("Year Level (short)        : " + yearLevel);
        System.out.println("Enrollment Count (int)    : " + enrollmentCount);
        System.out.println("World Population (long)   : " + worldPopulation);
        System.out.println("Body Temperature (float)  : " + bodyTemperature + " °C");
        System.out.println("Exact Pi (double)         : " + exactPi);
        System.out.println("Is Enrolled? (boolean)    : " + isEnrolled);
        System.out.println("==========================================");
    }
}
