package vasu_289;

import java.util.Scanner;

public class Pro_16 {

	public static void main(String[] args) {
	    Scanner va = new Scanner(System.in);
	            System.out.println("1. Triangle");
	            System.out.println("2. Rectangle");
	            System.out.println("3. Circle");
	            System.out.print("Enter your choice (1/2/3): ");

	            int choice = va.nextInt();

	            switch (choice) {
	                case 1:
	                	System.out.print("Enter the base length of the triangle: ");
	        	        double base = va.nextDouble();

	        	        System.out.print("Enter the height of the triangle: ");
	        	        double height = va.nextDouble();

	        	        double area = 0.5 * base * height;
	        	        System.out.println("The area of the triangle is: " + area);
	                    break;
	                case 2:
	                	System.out.print("Enter the length of the rectangle: ");
	        	        double length = va.nextDouble();

	        	        System.out.print("Enter the width of the rectangle: ");
	        	        double width = va.nextDouble();

	        	        double rarea = length * width;
	        	        System.out.println("The area of the rectangle is: " + rarea);
	                    break;
	                case 3:
	                	System.out.print("Enter the radius of the circle: ");
	        	        double radius = va.nextDouble();

	        	        double carea = 3.14 * radius * radius;
	        	        System.out.println("The area of the circle is: " + carea);
	                    break;
	                
	                default:
	                    System.out.println("Invalid choice. Please choose a valid option.");
	            }
	        }
	    

	   
}
