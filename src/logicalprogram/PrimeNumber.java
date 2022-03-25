package logicalprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,s=0;
		 System.out.print("Enter a number : ");  
		 Scanner input=new Scanner(System.in);
	      a= input.nextInt();
	      if (a==0 || a==1)
	      { s=1;}
	      for(int i=2;i<=a/2;++i)
	      {
	    	    if (a%i==0) 
	    	    {
	    	      s=1;
	    	      break;
	    	    }
	     }
	      
	    	  if(s==0)
	    	    System.out.println("It's a prime number.");
	    	  else
	    		System.out.println("Not a prime number.");
	}

}
