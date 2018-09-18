package Lang_fund;

import java.util.Scanner;


public class ArrayDemo {
	private static int searchfun(int[] intArr)
	{
		//iterate over array using for each loop
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		boolean f=true;
		int num = scan.nextInt();
		int i =0;

		for (int val : intArr) {
			if (val == num) {
				System.out.println("Position of given number : " +i);
				f=false;
				break;
			}
			i++;
		}

		if(f)
		{
			return -1;
		}
		return 1;
	}

	public static void main(String[] args) {
		int intArr[] = new int[5];//declaration & initialization of array

		//initialize array elements
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;

		System.out.println(searchfun(intArr));
	}
}
