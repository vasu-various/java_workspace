package vasu_289;

import java.util.Scanner;

public class Pro_11 {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a Year :");
		int y = sc.nextInt();
		int a = y%4;
		if(a==0)
		{
			System.out.println("Given Year is leap year");
		}
		else
		{
			System.out.println("Given Year is Not a leap year");
		}
}
}	
