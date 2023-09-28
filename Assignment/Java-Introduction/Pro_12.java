package vasu_289;

import java.util.Scanner;

public class Pro_12 {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a First No. :");
		int f = sc.nextInt();
		System.out.println("Enter a Second No. :");
		int s = sc.nextInt();
		System.out.println("Enter a Third No. :");
		int t = sc.nextInt();
		if(f>s)
		{
			if(f>t) {
				System.out.println(f+" is max");

			}
			else
			{
				System.out.println(t+" is max");

			}

		}
		else
		{
			if(s>t) {
				System.out.println(s+" is max");

			}
			else
			{
				System.out.println(t+" is max");

			}

		}
	}
}
