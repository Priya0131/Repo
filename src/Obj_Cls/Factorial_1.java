package Obj_Cls;

class calc {
	void fact1(int n){
		int fact = 1;
		for (int i =1; i<=n; i++){
			fact = fact*i;
		}
	System.out.println(fact);
}
}
public class Factorial_1 {
	
public static void main(String[] args) {
		new calc().fact1(5);

	}

}

