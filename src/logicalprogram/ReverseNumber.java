package logicalprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,remainder,b=0;
		System.out.println("enter a number:");
		 a = input.nextInt();
		 
		 while(a!=0)
		     {
			 remainder= a%10; 
			 b = (b*10)+remainder;
			 a = a/10;
		     }
		 System.out.println("reversed number is "+b);
			 
	}

}
