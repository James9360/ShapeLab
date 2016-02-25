package edu.cis232.shape;

public class RightTriangle 
{
	double v1 = 0;
	double v2 = 0;
	public RightTriangle(double value1, double value2){
		v1 = value1;
		v2 = value2;	
	}
	public double getArea(){
		return 0.5*v1*v2;
	}
	public double getPerimeter(){
		double ph = v1*v1;
		ph+= v2*v2;
		return v1 + v2 + Math.sqrt(ph);
	}
}
