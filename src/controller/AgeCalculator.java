package controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Get the user's birthdate
        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String birthdateString = scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(birthdateString);
        
        // Calculate the age
        Period age = Period.between(birthdate, currentDate);
        
        // Print the age
        System.out.println("Your age is: " + age.getYears() + " years, "
        + age.getMonths() + " months, and " + age.getDays() + " days.");
        
        
 int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        // Get the user's birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        // Calculate the age
        int agee = currentYear - birthYear;
        
        // Print the age
        System.out.println("Your age is: " + agee + " years.");
        
        scanner.close();
    }
}
