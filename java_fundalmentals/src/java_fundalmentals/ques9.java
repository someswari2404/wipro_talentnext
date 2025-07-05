package java_fundalmentals;
import java.util.Scanner;
public class ques9 {
	    public static void main(String[] args) {
	        if (args.length != 2) {
	            System.out.println("Usage: java InterestCalculator <Gender> <Age>");
	            return;
	        }

	        String gender = args[0].toLowerCase(); 
	        int age;

	        try {
	            age = Integer.parseInt(args[1]);
	        } catch (NumberFormatException e) {
	            System.out.println("Age must be a valid number.");
	            return;
	        }

	        if (gender.equals("female") && age >= 1 && age <= 58) {
	            System.out.println("The percentage of interest is 8.2%");
	        } else {
	            System.out.println("No interest rate available for the given gender and age.");
	        }
	    }
	}

