package main.java;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) 
	{
	
	}
	public String triangleType(int a, int b, int c) throws Exception
	{
		int edges[] = {a, b, c};
		Arrays.sort(edges);
		
		if(edges[0] + edges[1] <= edges[2])
			throw new Exception("not a triangle");
		if(edges[0] == edges[1] && edges[1] == edges[2])
			return "A triangle";
		else if(edges[0] == edges[1] || edges[1] == edges[2])
			return "B triangle";
		else
			return "C triangle";
	}
}
