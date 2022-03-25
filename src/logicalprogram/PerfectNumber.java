package logicalprogram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a,b,sum=0;  
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number:");  
		a=input.nextShort();       
		for(byte i=1;i<a; i++)  
		     {  
		         b=(byte)(a%i);  
		         if(b==0)  
		            {  
		               sum=(short)(sum+i);  
		            }
		     }  
		if (sum == a) {  
		      System.out.println(" It's a Perfect Number");}  
		else  {
		       System.out.println("Not a Perfect Number");}
	}

}
