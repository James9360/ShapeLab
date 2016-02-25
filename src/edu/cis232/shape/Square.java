package edu.cis232.shape;

public class Square implements Shape
{
	double v1 = 0;
	public Square(double value1){
		v1 = value1;
	}
	public double getArea(){
		return v1*v1;
	}
	public double getPerimeter(){
		return v1*4;
	}
	public String toString(){
		return "The Square has an area of " + this.getArea() + " and a perimeter of " + this.getPerimeter();
	}
}
