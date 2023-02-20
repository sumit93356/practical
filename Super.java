package Super.com;
//by using Super class keyword we can use parent class data member
class Shape{//parent class
	String Name="circle";	
}
class Size extends Shape{//child class
	String Name="no size";
	void print() {
		System.out.println(Name);
		System.out.println(super.Name);//super keyword is used to when we in chlid and and parent class  both have same name to call parent one we can w 
	}
}


public class Super {//main class 

	public static void main(String[] args) {
		Size s=new Size();//object created 
		s.print();

	}

}
