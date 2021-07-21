package craft.java.packageone;

class BiCycle{
	int height = 33;
	
	String define_me(){
		return "a vehicel with pedals.";
	}
    BiCycle (){
		System.out.println("Parent class constructor");
	}
	
}

class MotorCycle extends BiCycle{
	int height = 55;
	
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		super(); //This calls the parent class constructor
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
		String temp=super.define_me(); // It calls the super class define_me method.
		System.out.println("My ancestor is a cycle who is "+ temp );
		System.out.println(height); //Outputs the height in the motorcycle class
		System.out.println(super.height); //Outputs the superclass method height
	}
}


public class SuperKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorCycle M=new MotorCycle();
	}

}
