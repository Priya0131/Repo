package Lang_fund;

import java.util.Scanner;

public class Ezee_shop {

		public static void main(String[] args) {
		
		int i = 5;			
		while(i<=10){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Name : ");
		String productname = sc.nextLine();
		
		System.out.println("Enter Search String : ");				
		String searchStr =  sc.nextLine();
		
		if (productname.contains(searchStr)){
				
				System.out.println("Pass");
		}
		else{
				System.out.println("Fail");
		}
	}
}
}
