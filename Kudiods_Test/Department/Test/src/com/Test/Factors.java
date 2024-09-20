package com.Test;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Number :");
	    int num = sc.nextInt();//13
	    
	    int fact=1;
	    
	    for(int i=1; i<=num; i++) 
	    	{
	         if(num%2==0)
	         {
	        	 fact=fact+1;
	         }
	    }
           if(fact==2)
           {
        	   System.out.println("It is a Prime Number");
           }
           

}
}
