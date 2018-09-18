package Obj_Cls;

//Initialize variable with reference variable
class Rect {
	int length;
	int width;
	
	void area(int a, int b){
		length = a;
		width = b;
		
	}
	void display(){System.out.println(length*width);
	}	
}

class Rectangle {

	public static void main(String[] args) {
	Rect r = new Rect();
	r.length=10;
	r.width=5;
	r.display();
	
	}

}
