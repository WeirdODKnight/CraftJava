package craft.java.packageone;

class Father {
	
	final int AGE = 82; //
	//age = 45;  We cannot change the value of age because it is final or constant
	
	//delete final to get rid from error in the son class doingNow method
	public final void doingNow(){
		System.out.println("reading book");
	}
	public void age(){
		System.out.println(AGE);
	}
	
}
final class Son extends Father{
	/*  // This is not acceptable because the doingNow method is final and it cannot be override
	 * public void doingNow(){ System.out.println("Watchin TV"); }
	 */
	public void age(){
		System.out.println(23); // We can override because the method is not final in the parent class
	}
	
}

/* We cannot inherit or extends the son class because it is final. To get rid of this error remove final keyword from the son class
 * class GrandSon extends Son{
 * 
 * }
 */
public class FinalKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Son s = new Son();
         s.doingNow();
         s.age();
         
	}

}
