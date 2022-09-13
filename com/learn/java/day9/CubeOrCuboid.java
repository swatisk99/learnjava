package com.learn.java.day9;
class Shape{
	private double length,breadth,height;
	void setDimensions(double length) {
		this.length = this.breadth = this.height = length;
	}
	void setDimensions(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	void getDimensions() {
		System.out.println("Dimensions : "+length+", "+breadth+" and "+height);
	}
	double getVolume() {
		return length*breadth*height;
	}
}

public class CubeOrCuboid {

	public static void main(String[] args) {
		Shape cube = new Shape();
		cube.setDimensions(22.5);
		//System.out.println(cube.length);  ==>  The field Shape.length is not visible
		System.out.println("Volume of cube : "+cube.getVolume());
		cube.getDimensions();
		Shape cuboid = new Shape();
		cuboid.setDimensions(10,15,15.5);
		System.out.println("Volume of cuboid : "+cuboid.getVolume());
		cuboid.getDimensions();
	}

}
