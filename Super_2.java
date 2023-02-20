package Super.com;
class Shape1{//parent class
	String Name="circle";
	void print() {
		System.out.println("print circle");
	}
}
class Size1 extends Shape1{//child class
	String Name="no size";
	void print() {
		System.out.println("print triangle");
		super.print();	
	}
	
	void display() {
		System.out.println("print nothing");
	}
	
}

public class Super_2 {

	public static void main(String[] args) {
		Size1 s=new Size1();//object created 
		s.display();
		s.print();
		

	}

}
