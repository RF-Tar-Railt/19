package Chapter3;
import java.util.Scanner;
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
		
		System.out.print("Please select a shape: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		if (str.equals("delta") || str.equals("Delta"))
		{
			System.out.print("Please input name: ");
			String delName = in.next();
			System.out.print("Please input a: ");
			double a=in.nextDouble();
			System.out.print("Please input b: ");
			double b=in.nextDouble();
			System.out.print("Please input c: ");
			double c=in.nextDouble();
			Shape s4 = new delta(a,b,c,delName);
			System.out.println("Area of " + s4.getName() + " is " +
					s4.area());
		}
		
		if (str.equals("Square") || str.equals("square"))
		{
			System.out.print("Please input name: ");
			String delName = in.next();
			System.out.print("Please input side: ");
			double side=in.nextDouble();
			Shape s4 = new Square(side,delName);
			System.out.println("Area of " + s4.getName() + " is " +
					s4.area());
		}
		else
			System.out.print("Unkown Shape");
	}
}

