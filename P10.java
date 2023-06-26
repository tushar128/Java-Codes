package com.tushar;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=4;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Number");

		//n=sc.nextInt();
		//System.out.println("Enter the 2 Number");
		//m=sc.nextInt();

		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=m-1;j++)
			{
				if(i==1||j==1||i== n-1||j== m-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
