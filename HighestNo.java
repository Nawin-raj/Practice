package Solutions;

import java.util.Scanner;

public class HighestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int num=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greatest number among "+a+" ,"+b+" and "+c+" is "+num);

	}

}
