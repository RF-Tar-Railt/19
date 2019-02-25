package Chapter3;
interface Comparable{
	int compareTo(Object obj);
}
public abstract class Shape implements Comparable{
	private String name;
	public Shape(String shapeName)
	{name = shapeName;}
	public String getName()
	{return name;}
	
	public abstract double area();
	public abstract double perimeter();
	
	public double semiPerimeter()
	{return perimeter()/2 ;}
	public int compareTo(Object obj)
	{
		final double EPSILON = 1.0e-15;
		//slightly bigger than
		//machine precision
		Shape rhs = (Shape) obj;
		double diff = area() - rhs.area();
		if (Math.abs(diff) <= EPSILON * Math.abs(area()))
			return 0; //area of this shape equals area of obj
		else if (diff < 0)
			return -1; //area of this shape less than area of obj
		else
			return 1; //area of this shape greater than area of obj
	}
	public class delta extends Shape
	{
		private double sideA;
		private double sideB;
		private double sideC;
		public delta(double deltaSideA,double deltaSideB,double deltaSideC,String deltaName)
		{
			super(deltaName);
			sideA = deltaSideA;
			sideB = deltaSideB;
			sideC = deltaSideC;
		}
		public double perimeter()
		{return sideA + sideB + sideC;}
		public double area()
		{return Math.sqrt(semiPerimeter()*(semiPerimeter()-sideA)*(semiPerimeter()-sideB)*(semiPerimeter()-sideC));}
	}
	public class CFX extends Shape
	{
		private double length;
		private double wide;
		public CFX(double cfxLength,double cfxWide,String cfxName)
		{
			super(cfxName);
			length = cfxLength;
			wide = cfxWide;
		}
		public double perimeter()
		{return 2*length + 2*wide;}
		public double area()
		{return wide * length;}
	}
	public class Circle extends Shape
	{
		private double radius;
		public Circle(double circleRadius, String circleName)
		{
			super(circleName);
			radius = circleRadius;
		}
		public double perimeter()
		{
			return 2 * Math.PI * radius; 
		}
		public double area()
		{ 
			return Math.PI * radius * radius; 
		}
	}
	public class Square extends Shape
	{
		private double side;
		public Square(double squareSide, String squareName)
		{
			super(squareName);
			side = squareSide;
		}
		public double perimeter()
		{
			return 4 * side; 
		}
		public double area()
		{ 
			return side * side; 
		}
	}
}
