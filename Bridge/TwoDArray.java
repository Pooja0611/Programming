package com.BridgeLabz.basics;

import java.io.PrintWriter;
import java.util.Scanner;

import com.BridgeLabz.util.UtilClass;

public class TwoDArray {

	static Scanner sc=new Scanner(System.in);
	public static int[][] inputInt(int m,int n)
	{
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the element");
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	
	 public static void display(int[][] a, int m, int n) {
			PrintWriter pw = new PrintWriter(System.out,true);
			pw.println("2D ARRAY is");

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					pw.print(a[i][j] + " ");
				}
				pw.println("\t");
			}
	 }
	
	
	

}
