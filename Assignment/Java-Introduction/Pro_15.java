package vasu_289;

import java.util.Scanner;

public class Pro_15 {

		public static void main(String[] args) {
	        Scanner va = new Scanner(System.in);
	        double result = 0;

	        System.out.println("--------------------------Calculator------------------------------");
	        System.out.print("Enter the first number: ");
	        double num1 = va.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = va.nextDouble();

	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.println("5. Modulo");

	        
	        System.out.println("Choose an operation:");

	        int choice = va.nextInt();

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case 4:
	                  result = num1 / num2;
	                  System.out.println("Result: " + result);
	                  break;
	            case 5:
	                  result = num1 % num2;
	                  System.out.println("Result: " + result);
	                  break;
	            default:
	                System.out.println("Invalid choice. Please choose a valid operation.");
	        }

	    }
}


