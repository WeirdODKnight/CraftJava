package craft.java.packageone;

public class StaticExample {

	 // class field : static is a must for class field(a.k.a static field)
    // is like a global variable
    // when accessed by a method which does not belong to class Circle, we have to use Circle.PI to access the field
    // when accessed within class Circle, we use simply PI
    public static final double PI = 3.14159; // final because PI value is fixed (i.e. constant)
    // class method
    public static double radiansToDegrees(double rads) {
        System.out.println("Degrees --> "+(rads * (180/PI)));
        return (rads * (180/PI));
    }
    public double r; // instance field because no static
    // instance method
    public double area() {
        return PI * r * r;
    }
    // instance method
    public double circumference() {
        return 2 * PI * r;
    }
    public static void main(String[] args) {
        StaticExample c = new StaticExample ();
        // when accessing a class field(static field), use Circle.PI and not c.PI
        System.out.println("PI --> "+ StaticExample .PI);
        // Accessing static methods(class methods)
        StaticExample .radiansToDegrees(1.0);
        // when initializing or accessing a class field(static field) or a static method, use c.PI
        System.out.println("Radius --> "+ (c.r = 12));
        System.out.println("Area --> "+(c.area()));
        System.out.println("Circumference --> "+(c.circumference()));

    }


}