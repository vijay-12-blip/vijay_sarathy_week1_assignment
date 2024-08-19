package week1;

import java.util.Scanner;

class OddOrEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		if(n/2*2==n)
			System.out.println(n+" is an even number");
		else
			System.out.println(n+" is an odd number");
	}
}
