class Nestedif3{
public static void main(String[]args){

int num1=2;
int num2=3;

if(num1==3){
if(num2==5){
System.out.println("wrong statement");
}
else{ 
System.out.println("Not matched");
}
}
else{
System.out.println("1st condition not satisfied");
}
}
}