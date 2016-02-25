package edu.cis232;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import edu.cis232.shape.*;

public class MainApplication 
{
	public static void main(String[] args) 
	{
		ArrayList<Shape> shapes = readFile();
		calculateShapes (shapes);
	}
	
	public static void calculateShapes (ArrayList<Shape> shapes)
	{
		for (Shape s : shapes)
		{
			if (s instanceof Circle)
			{
				System.out.println(s.toString());
			}
			
			else if (s instanceof Square)
			{
				System.out.println(s.toString());
			}
			
			else if (s instanceof Rectangle)
			{
				System.out.println(s.toString());
			}
			
			else if (s instanceof RightTriangle)
			{
				System.out.println(s.toString());
			}
		}
	}
	
	public static ArrayList<Shape> readFile()
	{
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		File file = new File ("Shapes.csv");
		
		try 
		{
			Scanner scan = new Scanner (file);
			
			while (scan.hasNext())
			{
				String temp = scan.nextLine().toLowerCase();
				//System.out.println(temp); // This is to test.
				StringTokenizer strToken = new StringTokenizer(temp, ",", false);
				
				if (temp.contains("circle"))
				{
					double radius;
					while (strToken.hasMoreTokens())
					{
						if (strToken.nextToken().equals("circle"))
						{
							radius = Double.parseDouble(strToken.nextToken().trim());
							Circle c = new Circle (radius);
							shapes.add(c);
							//System.out.printf("The Circle has an area of %.2f and a perimeter of %.2f", c.getArea(), c.getPerimeter());
						}					
					}
					
				}
				
				else if (temp.contains("square"))
				{
					double length;
					while (strToken.hasMoreTokens())
					{
						if (strToken.nextToken().equals("square"))
						{
							length = Double.parseDouble(strToken.nextToken().trim());
							Square s = new Square (length);
							shapes.add(s);
							//System.out.printf("\nThe Square has an area of %.2f and a perimeter of %.2f", s.getArea(), s.getPerimeter());
						}
									
					}
				}
				
				else if (temp.contains("rectangle"))
				{
					double length, width;
					while (strToken.hasMoreTokens())
					{
						if (strToken.nextToken().equals("rectangle"))
						{
							length = Double.parseDouble(strToken.nextToken().trim());
							width = Double.parseDouble(strToken.nextToken().trim());
							Rectangle r = new Rectangle (length, width);
							shapes.add(r);
							//System.out.printf("\nThe Rectangle has an area of %.2f and a perimeter of %.2f", r.getArea(), r.getPerimeter());
						}
									
					}
				}
				else if (temp.contains("righttriangle"))
				{
					double base, height;
					while (strToken.hasMoreTokens())
					{
						if (strToken.nextToken().equals("righttriangle"))
						{
							base = Double.parseDouble(strToken.nextToken().trim());
							height = Double.parseDouble(strToken.nextToken().trim());
							RightTriangle r = new RightTriangle (base, height);
							shapes.add(r);
							//System.out.printf("\nThe Right Triangle has an area of %.2f and a perimeter of %.2f", r.getArea(), r.getPerimeter());
						}
									
					}
				}						
				
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return shapes;
	}
}
