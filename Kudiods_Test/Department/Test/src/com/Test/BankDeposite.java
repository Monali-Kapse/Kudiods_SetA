package com.Test;

import java.util.Scanner;

public class BankDeposite {
	
	public void Deposite(){
		{
			System.out.println("Hello");
		
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.println("Enter the Amount :");

		if(amount<=0)
		{
			System.out.println("There is an Custom Exception..");
		}
		BankDeposite bd = new BankDeposite();
		bd.Deposite();
	
	
	}

}
