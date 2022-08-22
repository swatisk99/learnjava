import java.util.*;
class GeometricalCalculations{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		double side,length,breadth,radius; 
		System.out.println("\n\nSide of square");
		side=s.nextFloat();
		System.out.println("Area : "+(side*side));
		System.out.println("Sides of rectangle");
		length=s.nextFloat();
		breadth=s.nextFloat();
		System.out.println("Area : "+(length*breadth));
		System.out.println("Circle radius");
		radius=s.nextFloat();
		System.out.println("Area : "+(Math.PI*radius*radius));
	}
}