package craft.java.packageone;

public class InnerClassExample {

	  int outerVariable = 100;
	  
	    class MemberClass {
	        int innerVariable = 20;
	         
	        int getSum(int parameter) {
	            return innerVariable +  outerVariable + parameter;
	        }       
	    }
	     
	    public static void main(String[] args) {
	        InnerClassExample outer = new InnerClassExample();
	        MemberClass inner = outer.new MemberClass(); 
	        System.out.println(inner.getSum(3));
	        outer.run();
	    }
	     
	    void run() {
	        MemberClass localInner = new MemberClass();
	        System.out.println(localInner.getSum(5));
	    }
}