package Lang_fund;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();

		for (int i = str.length()-1; i>=0;i--)
			rev = rev+str.charAt(i);
			if(str.equals(rev))
				System.out.println(str +" is palindrome");
			else
				System.out.println(str +" is not palindrome");
	}

}
