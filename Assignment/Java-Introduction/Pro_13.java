package vasu_289;

import java.util.Scanner;

public class Pro_13 {
	public static void main(String[] args) {
		Scanner va = new Scanner(System.in);
		System.out.println("Enter First Subject's Marks : ");
		int a = va.nextInt();
		System.out.println("Enter Second Subject's Marks : ");
		int b = va.nextInt();
		System.out.println("Enter Third Subject's Marks : ");
		int c = va.nextInt();
		System.out.println("Enter Forth Subject's Marks : ");
		int d = va.nextInt();
		System.out.println("Enter Fifth Subject's Marks : ");
		int e = va.nextInt();
		int f = a+b+c+d+e;
		System.out.println("Total Marks you got is  : " + f);

		double re = f/5;
		if(re>75)
		{
			System.out.println("Distinction");

		}
		else if(re>60 && re<=75) 
		{
			System.out.println("First class");

		}
		else if(re>50 && re<=60) 
		{
			System.out.println("Second class");

		}
		else if(re>35 && re<=50) 
		{
			System.out.println("Pass class");

		}
		else {
			System.out.println("Fail");

		}
	}
}
