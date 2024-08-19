package week1;

import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
		int choice = sc.nextInt();
		int x,y;
		
		switch(choice)
		{
		case 1:
			
			System.out.println("Enter two numbers");
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("The Sum of "+x+" & "+y+" is "+(x+y));
			System.out.println("-----------------------------------");
			break;
			
		case 2:
			System.out.println("Enter two numbers");
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("The Difference of "+x+" & "+y+" is "+(x-y));
			System.out.println("-----------------------------------");
			break;
			
		case 3:
			System.out.println("Enter two numbers");
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("The Product of "+x+" & "+y+" is "+(x*y));
			System.out.println("-----------------------------------");
			break;
			
		case 4:
			System.out.println("Enter two numbers");
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("The Division of "+x+" & "+y+" is "+(x/y));
			System.out.println("-----------------------------------");
			break;
			
		default:
			System.out.println("Invalid Number");
			System.out.println("-----------------------------------");
			break;
		}
	}
}
