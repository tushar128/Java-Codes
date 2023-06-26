package com.tushar;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum=i+j;
				if(sum%2==0)
					System.out.print(" A");
				else
				System.out.print(" B");
			}
			System.out.println(" ");
	}

	}
}