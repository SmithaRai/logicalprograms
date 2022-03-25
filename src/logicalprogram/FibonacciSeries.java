package logicalprogram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i=0,j=1,c=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the limit:");
		byte a=input.nextByte();
		System.out.println("Fibonacci series of "+a+":");
		System.out.print(+i+ " "+j+" ");

		c=(byte)(i+j);

while(c<a){
			
			System.out.print(+c+ " ");
			i=j;
			j=c;	
			c=(byte)(i+j);
			}
	}

}
