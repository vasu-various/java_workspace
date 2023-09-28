package vasu_289;

import java.util.Scanner;

public class Pro_14 {

	public static void main(String[] args) {
		Scanner va = new Scanner(System.in);
		System.out.println("Enter a Number For week Day : ");
		int day = va.nextInt();

		switch (day) {
           	case 1:
               System.out.println("Monday");
               break;
           	case 2:
               System.out.println("Tuesday");
               break;
           	case 3:
               System.out.println("Wednesday");
               break;
           	case 4:
               System.out.println("Thursday");
               break;
           	case 5:
               System.out.println("Friday");
               break;
           	case 6:
               System.out.println("Saturday");
               break;
           	case 7:
               System.out.println("Sunday");
               break;
           	default:
               System.out.println("Invalid day of the week");
       }
	}
}

