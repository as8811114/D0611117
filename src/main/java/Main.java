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
			throw new Exception("無法生成三角形");
		if(edges[0] == edges[1] && edges[1] == edges[2])
			return "正三角形";
		else if(edges[0] == edges[1] || edges[1] == edges[2])
			return "等腰三角形";
		else
			return "一般三角形";
	}
}
