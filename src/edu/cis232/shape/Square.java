package edu.cis232.shape;

public class Square 
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
}
