package Super.com;
class Delhi_batch{
	int id;
	String Name;
	int fees;
	//parent  class constructor
	Delhi_batch(int id,String Name,int fees){
		this.id=id;
		this.Name=Name;
		this.fees=fees;
		
	}
}
class BatchMember extends Delhi_batch{
	long phone_no;//child class properties 
	//child class constructor
	BatchMember(int id,String Name,int fees,long phone_no){
		super(id,Name,fees);//reusing parent constructor
		this.phone_no=phone_no;
	}
	void show() {
		System.out.println(id+" "+ Name +" "+ fees+" " +phone_no);
	}
}
public class Eg_Super {

	public static void main(String[] args) {
		BatchMember B=new BatchMember(101,"sandeep",1500,123456);
		B.show();

	}

}
