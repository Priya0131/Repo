package Lang_fund;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		int r,sum = 0,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();
		
		temp = num;
		while(num>0){
			r=num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		if (temp==sum)
			System.out.println("The given number is polindrome");
		else
			System.out.println("The given number is not polindrome");
		}

	}


