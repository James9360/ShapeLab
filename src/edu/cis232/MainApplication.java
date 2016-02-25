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
		ArrayList<String> shapes = readFile();
		calculateShapes (shapes);
	}
	
	public static void calculateShapes (ArrayList<String> shapes)
	{
		for (String t : shapes)
		{
			StringTokenizer strToken = new StringTokenizer(t, ",", false);
			if (t.contains("circle"))
			{
				double radius;
				while (strToken.hasMoreTokens())
				{
					if (strToken.nextToken().equals("circle"))
					{
						radius = Double.parseDouble(strToken.nextToken().trim());
						Circle c = new Circle (radius);
						System.out.printf("The Circle has an area of %.2f and a perimeter of %.2f", c.getArea(), c.getPerimeter());
					}
								
				}
			}
			
			else if (t.contains("square"))
			{
				double length;
				while (strToken.hasMoreTokens())
				{
					if (strToken.nextToken().equals("square"))
					{
						length = Double.parseDouble(strToken.nextToken().trim());
						Square s = new Square (length);
						System.out.printf("\nThe Square has an area of %.2f and a perimeter of %.2f", s.getArea(), s.getPerimeter());
					}
								
				}
			}
			
			else if (t.contains("rectangle"))
			{
				double length, width;
				while (strToken.hasMoreTokens())
				{
					if (strToken.nextToken().equals("rectangle"))
					{
						length = Double.parseDouble(strToken.nextToken().trim());
						width = Double.parseDouble(strToken.nextToken().trim());
						Rectangle r = new Rectangle (length, width);
						System.out.printf("\nThe Rectangle has an area of %.2f and a perimeter of %.2f", r.getArea(), r.getPerimeter());
					}
								
				}
			}
			else if (t.contains("righttriangle"))
			{
				double base, height;
				while (strToken.hasMoreTokens())
				{
					if (strToken.nextToken().equals("righttriangle"))
					{
						base = Double.parseDouble(strToken.nextToken().trim());
						height = Double.parseDouble(strToken.nextToken().trim());
						RightTriangle r = new RightTriangle (base, height);
						System.out.printf("\nThe Right Triangle has an area of %.2f and a perimeter of %.2f", r.getArea(), r.getPerimeter());
					}
								
				}
			}
		}		
	}
	
	public static ArrayList<String> readFile()
	{
		ArrayList<String> shapes = new ArrayList<String>();
		File file = new File ("Shapes.csv");
		try 
		{
			Scanner scan = new Scanner (file);
			while (scan.hasNext())
			{
				shapes.add(scan.nextLine().toLowerCase());
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return shapes;
	}
}
