package com.tushar;

import java.util.Scanner;

public class ABP8 {
	public static void main(String[] args) {

	// TODO Auto-generated method stub
	int sum,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	n=sc.nextInt();
	for(int i=1;i<n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			//sum=i+j;
			if(i%2==0)
				System.out.print(" B");
			else
			System.out.print(" A");
		}
		System.out.println(" ");
}
}

}
