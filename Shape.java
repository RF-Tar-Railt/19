package Chapter3;

public abstract class Shape {
	private String name;
	public Shape(String shapeName)
	{name = shapeName;}
	public String getName()
	{return name;}
	
	public abstract double area();
	public abstract double perimeter();
	
	public double semiPerimeter()
	{return perimeter()/2 ;}
	
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
