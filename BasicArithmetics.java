package week1;

import java.util.Scanner;

class BasicArithmetics 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("The Sum of "+a+" & "+b+" is "+(a+b));
		System.out.println("The Difference of "+a+" & "+b+" is "+(a-b));
		System.out.println("The Product of "+a+" & "+b+" is "+(a*b));
		System.out.println("The Division of "+a+" & "+b+" is "+(a/b));
	}
}
