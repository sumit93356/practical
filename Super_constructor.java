package Super.com;
class shape2{//parent class
	//constructor for parent class 
	shape2(){
	System.out.println("Hello");	
	}
}
class size2 extends shape2{//child class
	//constructor  for child class
	size2(){
		super ();//it is not important to write super because by default constructor call
		System.out.println("Hii");
	
	}
}
//main class 
public class Super_constructor {

	public static void main(String[] args) {
		size2 s=new size2();//object created
	}

}
