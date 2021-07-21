package craft.java.packageone;


class Bank_A{
	
	
double rti(int a){
return a;

}


}
class Bank_B extends Bank_A{
	
double rti(){
return 6;

}
//This method overrides the bank a method
double rti(int a) {
	return a*100;
}

}
class Bank_C extends Bank_B{
	
double rti(float a){
return a;

}
//This method overrides the bank b method
double rti(int a) {
	return a*2;
}

}

public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_A i=new Bank_A();
		Bank_B o=new Bank_B();
		Bank_C p=new Bank_C();
		System.out.println("The Rate of Interest of Bank_A : "+i.rti(5));
		System.out.println("The Rate of Interest of Bank_B OVERRIDE METHOD: "+o.rti(5));
		
		System.out.println("The Rate of Interest of Bank_B : "+o.rti());
		System.out.println("The Rate of Interest of Bank_C : "+p.rti(6.5f));
		System.out.println("The Rate of Interest of Bank_C OVERRIDE METHOD : "+p.rti(5));
		}}