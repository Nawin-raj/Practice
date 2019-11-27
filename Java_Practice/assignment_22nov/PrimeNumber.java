package assignment_22nov;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		boolean prime=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				prime=true;
					break;
			}
		}
		
		if(prime)
		System.out.println(n+" is not a  prime number");
		else
			System.out.println(n+" is prime number");
		
		
	}

}
