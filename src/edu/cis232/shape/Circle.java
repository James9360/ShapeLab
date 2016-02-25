package edu.cis232.shape;

public class Circle implements Shape
{
	double v1 = 0;
	public Circle(double value){
		v1 = value;	
	}
	final double PI = Math.PI;
	public double getArea(){
		return v1 * PI * PI;
	}
	public double getPerimeter(){
		return 2 * PI * v1;
	}
}
