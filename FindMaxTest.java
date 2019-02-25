package Chapter3;

public class FindMaxTest
{
	/** Return the larger of two objects a and b. */
	public static Comparable max(Comparable a, Comparable b)
	{
		if (a.compareTo(b) > 0) //if a > b ...
			return a;
		else
			return b;
	}
	/** Test max on two Shape objects. */
	public static void main(String[] args)
	{
		Shape s1 = new delta(3.0,4.0,5.0, "delta");
		Shape s2 = new Square(4.5, "square");
		System.out.println(s1.semiPerimeter());
		System.out.println("Area of " + s1.getName() + " is " +
				s1.area());
		System.out.println("Area of " + s2.getName() + " is " +
				s2.area());
		Shape s3 = (Shape) max(s1, s2);
		System.out.println("The larger shape is Shape:" +
				s3.getName());
	}
}

