package craft.java.packageone;

import craft.java.packagetwo.AdditionClass;

public class ProtectedAccessModifierExample extends AdditionClass{

	//We extend another class from package two.
	//we use protected keyword so we can access the methods and the fields of Addition class
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccessModifierExample obj = new ProtectedAccessModifierExample();
		System.out.println(obj.addTwoNumbers(11, 22));
		System.out.println(obj.c);
	}

}
