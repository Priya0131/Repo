package Lang_fund;

class Student{  
int rollno;  
String name;  
float fee;  
/*Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  */
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
public class TestThis1{  
public static void main(String args[]){  
//Student s1=new Student(111,"ankit",5000f);  
//Student s2=new Student(112,"sumit",6000f);
	Student s1= new Student();
	s1.rollno = 111;
	s1.name = "ankit";
	s1.fee = 10000f;
s1.display();  
}}  