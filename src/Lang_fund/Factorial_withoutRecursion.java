package Lang_fund;

import java.util.Scanner;

public class Factorial_withoutRecursion {
	//int fact1(int n)
	static int fact1(int n)
	{
		int multi=1;

		if (n>1)
		{
			for (int i=1; i<=n; i++)
			{
				multi=multi*i;
			}
				}
		return multi;
	}


	public static void main(String[] args) {
		int n = 0;
		//System.out.println(fact1(n));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = scan.nextInt();
		//Factorial_withoutRecursion f = new Factorial_withoutRecursion();
		System.out.println("Factorial of given number :" +Factorial_withoutRecursion.fact1(n));
	}
}
