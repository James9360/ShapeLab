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
		for (String t : shapes)
		{
			StringTokenizer strToken = new StringTokenizer(t, ",", false);
			if (t.contains("Circle"))
			{
				double temp;
				while (strToken.hasMoreTokens())
				{
					//temp = Double.parseDouble(strToken.nextToken());
					System.out.println(strToken.nextToken());
				}
				System.out.println(t);
			}
			else if (t.contains("Square"))
			{
				System.out.println(t);
			}
			else if (t.contains("Rectangle"))
			{
				System.out.println(t);
			}
			else if (t.contains("RightTriangle"))
			{
				System.out.println(t);
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
				shapes.add(scan.nextLine());
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return shapes;
	}
}
