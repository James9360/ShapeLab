package edu.cis232.shape;

public class Rectangle implements Shape
{
	double v1 = 0;
	double v2 = 0;
	public Rectangle(double value1, double value2){
		v1 = value1;
		v2 = value2;	
	}
	public double getArea(){
		return v1*v2;
	}
	public double getPerimeter(){
		return v1+v1+v2+v2;
	}
	
	public String toString(){
		return "The Rectangle has an area of " + this.getArea() + " and a perimeter of " + this.getPerimeter();
	}
}
